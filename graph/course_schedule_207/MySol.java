package graph.course_schedule_207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySol {

	public boolean canFinish(int cn, int[][] pr) {
		boolean[] visited = new boolean[pr.length];
		for(int i=0;i<pr.length;i++){
			//visited[0] = true;
			if(!dfs(pr, visited, i, pr[i][0])){
				return false;
			}
			Arrays.fill(visited, false);
		}
		return true;
    }
	
	boolean dfs(int[][] pr, boolean[] visited, int index, int val){
		if(index==-1) return true;
		for(int t=0;t<pr.length;t++){
			if(!visited[t]){
				visited[t] = true;
				if(pr[t][1]==val){
					return false;
				}
				else return dfs(pr, visited, getIndex(pr, pr[t][1]), val);
			}
		}
		return true;
	}
	
	int getIndex(int[][] pr, int val){
		for(int i=0;i<pr.length;i++){
			if(pr[i][0]==val) return i;
		}
		return -1;
	}
	
	boolean listcheck(int numofcourses, int[][] pr){
		List<Integer> list = new ArrayList<Integer>();
		if(pr.length>0){
			list.add(pr[0][0]);
			list.add(pr[0][1]);
		} else return true;
		for(int i=1;i<pr.length;i++){
			if(!list.contains(pr[i][0])) list.add(pr[i][0]);
			if(!list.contains(pr[i][1])) list.add(pr[i][1]);
		}
		return list.size()>=numofcourses;
	}
	
	public static void main(String[] args) {
		int cn = 6; int[][] pr = {{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
		MySol sol = new MySol();
		boolean test = sol.canFinish(cn, pr) && sol.listcheck(cn, pr);
		System.out.println(test);
	}
}
