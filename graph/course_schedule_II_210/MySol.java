package graph.course_schedule_II_210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MySol {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		Graph g = new Graph(numCourses);
		for(int i=0;i<prerequisites.length;i++){
			if(i<prerequisites.length)g.addEdge(prerequisites[i][0], prerequisites[i][1]);
		}
		int numVertices = g.V;
		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<numVertices;i++){
			if(g.inOrder[i]==0) q.add(i);
		}
		while(!q.isEmpty()){
			int n1 = q.poll();
			if(!stack.contains(n1))stack.push(n1);
			numVertices--;
			
			for(int t : g.arr[n1]){
				if(--g.inOrder[t]==0){
					q.add(t);
				}
			}
			
		}
		if(numVertices!=0){
			return new int[0];
		}
		int[] ret = new int[g.V];int i=0;
		while(!stack.isEmpty()) ret[i++] = stack.pop();
		return ret;
	}
	
	class Graph {
		int V;
		LinkedList<Integer>[] arr;
		int[] inOrder;
		
		public Graph(int vertices){
			V = vertices;
			arr = new LinkedList[vertices];
			inOrder = new int[vertices];
			
			for(int i=0;i<vertices;i++){
				arr[i] = new LinkedList();
			}
		}
		
		void addEdge(int src, int dest){
			arr[src].add(dest);
			inOrder[dest]++;
		}
	}

    
    public static void main(String args[]) 
	{
		int[][] pr = {{2,0},{1,0},{3,1},{3,2},{1,3}};
		int [] ret = new MySol().findOrder(4, pr);
		for(int i=0;i<pr.length;i++){
			System.out.print(ret[i]);
		}
		System.out.println(); 
	} 
}
