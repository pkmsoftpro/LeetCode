package graph.course_schedule_207;

/*
 * https://leetcode.com/problems/course-schedule/discuss/245177/Using-Kahn's-Algorithm-Topological-Sort-Beat-97
 * 
 * jeantimex:
 * https://leetcode.com/problems/course-schedule/discuss/58746/AC-Java-Adjacency-List-Kahn_s_Algorithm_Topological
 * 
 * helloworld123456
 * https://leetcode.com/problems/course-schedule/discuss/58523/JAVA-Easy-Version-To-UnderStand!!!!!!!!!!!!!!!!!
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Kahn_s_Algorithm_Topological {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        for(int[] pre: prerequisites) {
            g.addEdge(pre[0], pre[1]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < g.nVertices; i++) {
            if (g.inDegrees[i] == 0) queue.add(i);
        }
        int topSortNodes = g.nVertices;
        Stack<Integer> s = new Stack<Integer>();
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            s.push(curr);
            topSortNodes--;
            LinkedList<Integer> neighbors = g.adjacencyList[curr];
            for(int node: neighbors) {
                if (--g.inDegrees[node] == 0) {
                    queue.add(node);
                }
            }
        }
        return topSortNodes == 0;
    }
    
    class Graph {
        final int nVertices;
        final LinkedList<Integer>[] adjacencyList;
        int[] inDegrees;
        
        Graph(int n) {
            nVertices = n;
            adjacencyList = new LinkedList[n];
            for(int i = 0; i < n; i++) {
                adjacencyList[i] = new LinkedList<Integer>();
            }
            inDegrees = new int[n];
        }
        
        private void addEdge(int src, int destination)  {
            adjacencyList[src].add(destination);
            inDegrees[destination]++;
        }
    }
    
    public static void main(String args[]) 
	{
		int[][] pr = {{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
		System.out.println(new Kahn_s_Algorithm_Topological().canFinish(6, pr)); 
	} 
}

