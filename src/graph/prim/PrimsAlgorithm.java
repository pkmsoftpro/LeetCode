package graph.prim;

import java.util.stream.IntStream;

public class PrimsAlgorithm {

  public static void main(String[] args) {
    PrimsAlgorithm prims = new PrimsAlgorithm();
    int[][] graph = new int[][] { { 0, 2, 0, 6, 0 },
                                  { 2, 0, 3, 8, 5 },
                                  { 0, 3, 0, 0, 7 },
                                  { 6, 8, 0, 0, 9 },
                                  { 0, 5, 7, 9, 0 } };

    // Generate the solution
    prims.generateMST(graph);
  }

  public void generateMST(int[][] graph) {
    int V = graph.length;
    int[] key = IntStream.generate(() -> Integer.MAX_VALUE).limit(V).toArray();
    boolean[] mstArray = new boolean[V];
    int[] parent = new int[V];

    key[0] = 0;
    parent[0] = -1;

    for (int i = 0; i < V - 1; i++) {

      int minKeyIndex = getMinIndex(key, mstArray);

      mstArray[minKeyIndex] = true;

      for (int j = 0; j < V; j++)
        if (graph[minKeyIndex][j] != 0 && graph[minKeyIndex][j] < key[j]) {
          parent[j] = minKeyIndex;
          key[j] = graph[minKeyIndex][j];
        }

    }

    for (int i = 1; i < V; i++) {
      System.out.println(
          " src:" + parent[i] + 
          " dest:" + i + 
          " weight:" + graph[i][parent[i]]);
    }

  }

  private int getMinIndex(int[] key, boolean[] mstArray) {
    int minkey = Integer.MAX_VALUE;
    int minindex = 0;

    for (int i = 0; i < mstArray.length; i++) {
      if (!mstArray[i] && key[i] < minkey) {
        minkey = key[i];
        minindex = i;
      }
    }
    return minindex;
  }
}
