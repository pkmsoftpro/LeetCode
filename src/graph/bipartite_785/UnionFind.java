package graph.bipartite_785;

public class UnionFind {

  // A union-find data structure.

  public static void main(String[] args) {
    // Create a graph.
    int[][] graph = {{1, 4}, {0, 2}, {1}, {4}, {0, 3}};

    // {{1,2,3},{0,2},{0,1,3},{0,2}};
    // {{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
    // {{1,4},{0,2},{1},{4},{0,3}};


    // Check if the graph is bipartite.
    System.out.println(new UnionFind().isBipartite(graph));
  }

  // Find the root of the set that contains the given element.
  public int find(int x, int[] parent) {
    // If x is not the root of its set, then recursively find the root of its set.
    if (x != parent[x]) {
      parent[x] = find(parent[x], parent);
    }

    // Return the root of x's set.
    return parent[x];
  }

  // Union the sets that contain the given elements.
  public void union(int x, int y, int[] parent) {
    // Find the roots of the sets that contain x and y.
    int rootX = find(x, parent);
    int rootY = find(y, parent);

    // Merge the sets that contain x and y.
    parent[rootX] = rootY;
  }

  // Check if the given graph is bipartite.
  public boolean isBipartite(int[][] graph) {
    // Create an array of parents.
    int[] parent = new int[graph.length];

    // Initialize all parents to themselves.
    for (int i = 0; i < graph.length; i++) {
      parent[i] = i;
    }

    // For each edge in the graph, check if the two vertices are in the same set.
    for (int i = 0; i < graph.length; i++) {
      int[] adj = graph[i];

      for (int m : adj) {
        // If the two vertices are in the same set, then the graph is not bipartite.
        if (find(i, parent) == find(m, parent)) {
          return false;
        }

        // Do the union of all the adjacent vertices of i.
        union(adj[0], m, parent);
      }
    }

    return true;
  }
}
