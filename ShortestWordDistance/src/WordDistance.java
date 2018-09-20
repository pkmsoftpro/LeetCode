import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class WordDistance {

	private int getDistance(String[] sArray, String s1, String s2){
		
		int s1Loc = -1;
		boolean[] visited = new boolean[sArray.length];
		int[] distance = new int[sArray.length];
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<sArray.length; i++){
			if(sArray[i].equals(s1)){
				if(!visited[i])min =  Math.min(min,dfs(sArray, i, s2, visited, distance));
			}
		}
		
		return min==Integer.MAX_VALUE?-1:min;
	}
	
	private int dfs(String[] sArray, int s1Loc, String s2, boolean[] visited, int[] distance){
		int dist = 0;
		visited[s1Loc] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s1Loc);
		while(!q.isEmpty()){
			int x = q.poll();
			if((x-1)>=0 && !q.contains(x) && !visited[x-1]){
				q.add(x-1);
				
				if(x>=0 && x<sArray.length && !visited[x]){
					if(sArray[x].equals(s2)){
						return dist;
					}
					else {
						visited[x] = true;
						dist++;
					}
				}
			}
		}
			/*if(x+1<sArray.length && !q.contains(x+1) && !visited[x+1]){
				q.add(x+1);
				if(x>=0 && x<sArray.length && !visited[x]){
					if(sArray[x].equals(s2)){
						return dist;
					}
					else {
						visited[x] = true;
						dist++;
					}
				}
			}*/
			
		
		return dist;
	}
	
	
	
	public static void main(String[] args) {
		
		String[] sArray = {"practice", "makes", "perfect", "coding", "makes"};
		List<String> sList = Arrays.asList(sArray);
		System.out.println(new WordDistance().getDistance(sArray, "makes", "coding"));
	}
}
