package graph.bipartite_785;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

  // A BFS algorithm to check if a graph is bipartite.

  public static void main(String[] args) {
    // Create a graph.
    int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};

    //{{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
    //{{1,3},{0,2},{1,3},{0,2}};
    //{{1,2,3},{0,2},{0,1,3},{0,2}};
    
    
    // Check if the graph is bipartite.
    System.out.println(new Bfs().isBipartite(graph));
  }

  // Check if the given graph is bipartite.
  public boolean isBipartite(int[][] graph) {
    // Initialize a color array to store the color of each vertex.
    int[] color = new int[graph.length];

    // Initialize a queue to store the vertices that have not been visited yet.
    Queue<Integer> queue = new LinkedList<Integer>();

    // Iterate over all the vertices in the graph.
    for (int i = 0; i < graph.length; i++) {
      // If the vertex has not been visited yet, then do a BFS traversal from that vertex.
      if (color[i] == 0) {
        // Mark the vertex as visited and assign it a color.
        color[i] = 1;

        // Add the vertex to the queue.
        queue.add(i);

        // While the queue is not empty, do the following:
        while (!queue.isEmpty()) {
          // Remove the first vertex from the queue.
          int current = queue.poll();

          // Iterate over all the adjacent vertices of the current vertex.
          for (int neighbor : graph[current]) {
            // If the adjacent vertex has not been visited yet, then do the following:
            if (color[neighbor] == 0) {
              // Mark the adjacent vertex as visited and assign it a color that is different from the color of the current vertex.
              color[neighbor] = color[current] == 1 ? 2 : 1;

              // Add the adjacent vertex to the queue.
              queue.add(neighbor);
            } else {
              // If the adjacent vertex has been visited and its color is the same as the color of the current vertex, then the graph is not bipartite.
              if (color[neighbor] == color[current]) {
                return false;
              }
            }
          }
        }
      }
    }

    // The graph is bipartite if all the vertices have been visited and no two adjacent vertices have the same color.
    return true;
  }
}
