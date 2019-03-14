package graph.course_schedule_207;

public class sol_jeantimex {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
	    Graph graph = new Graph(numCourses);
	    
	    for (int i = 0; i < prerequisites.length; i++)
	      graph.addEdge(prerequisites[i][0], prerequisites[i][1]);
	    
	    return !graph.isCyclic();
	  }
	  
	  // ---------------------
	  //  Directed Graph
	  // ---------------------
	  class Graph {
	    int n;          // number of vertex
	    int[][] matrix; // adjacency matrix
	    
	    Graph(int x) {
	      n = x;
	      matrix = new int[n][n];
	    }
	    
	    void addEdge(int u, int v) {
	      matrix[u][v] = 1;
	    }
	    
	    // check if there's a cycle in the graph
	    boolean isCyclic() {
	      boolean[] visited = new boolean[n];
	      boolean[] stack = new boolean[n];
	      
	      for (int u = 0; u < n; u++)
	        if (dfs(u, visited, stack)) 
	          return true;
	    
	      return false;
	    }
	    
	    boolean dfs(int u, boolean[] visited, boolean[] stack) {
	      // mark it as visited
	      visited[u] = true;
	      stack[u] = true;
	      
	      // check all its neighbors
	      for (int v = 0; v < n; v++)
	        if (matrix[u][v] > 0)
	          if (stack[v] == true || (visited[v] == false && dfs(v, visited, stack)))
	            return true;
	      
	      // remove the vertex from recursion stack
	      stack[u] = false;
	      
	      return false;
	    }
	  }
		
		public static void main(String[] args) {
			int cn = 3; int[][] pr = {{0,1},{1,2},{2,0}};
			sol_jeantimex sol = new sol_jeantimex();
			boolean test = sol.canFinish(cn, pr);
			System.out.println(test);
		}

}
