package graph.bipartite_785;

public class Dfs {

  // A DFS algorithm to check if a graph is bipartite.

  public static void main(String[] args) {
    // Create a graph.
    int[][] graph = {{1, 4}, {0, 2}, {1}, {4}, {0, 3}};
    
    //{{3,4,6},{3,6},{3,6},{0,1,2,5},{0,7,8},{3},{0,1,2,7},{4,6},{4},{}};
    //{{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
    //{{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
    //{{1,3},{0,2},{1,3},{0,2}};
    //{{1,2,3},{0,2},{0,1,3},{0,2}};
    
    // Check if the graph is bipartite.
    System.out.println(new Dfs().isBipartite(graph));
  }

  // Check if the given graph is bipartite.
  public boolean isBipartite(int[][] graph) {
    // Initialize a color array to store the color of each vertex.
    int[] color = new int[graph.length];
    // Initialize the color of the first vertex to 1.
    color[0] = 1;

    // Recursively check if the graph is bipartite, starting from the first vertex.
    
    for(int i=0; i<graph.length; i++)
      if(!dfs(graph, color, i)) 
        return false;
    
    return true;
  }

  //Recursively check if the given graph is bipartite, starting from the given vertex.
  public boolean dfs(int[][] graph, int[] color, int vertex) {

    // For each adjacent vertex of the current vertex, do the following:
    for(int neighbor : graph[vertex]) {
    // If the adjacent vertex has been visited and its color is the same as the color of the current vertex, 
    // then the graph is not bipartite.
      if(color[neighbor]==color[vertex] && color[vertex]!=0) 
        return false;
      if(color[neighbor]==0) {
      // Mark the adjacent vertex as visited and assign it a color that is different from the color of the current vertex.
        color[neighbor] = color[vertex]==1?2:1;
        dfs(graph, color, neighbor);
      }
    }
    // The graph is bipartite if all the vertices have been visited and no two adjacent vertices have the same color.
    return true;
  }
}
