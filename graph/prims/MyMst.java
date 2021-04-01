package prims;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MyMst {

    public static void main(String[] args)
    {
		/* Let us create the following graph
            2   3
        (0)--(1)---(2)
        |    /  \   |
       6|  8/    \5 |7
        |  /      \ |
       (3)--------(4)
              9         */
        MyMst t = new MyMst();
        int graph[][] = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 9 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 5 },
                { 0, 5, 7, 9, 0 } };

        // Print the solution
        t.primMST(graph);
    }

    private void primMST(int[][] graph) {
        int Edges = graph.length;
        Integer[] key = new Integer[Edges];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        Integer[] parent = new Integer[Edges];
        parent[0] = -1;
        boolean[] visited = new boolean[Edges];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> key[a].compareTo(key[b]));
        pq.add(0);

        while(!pq.isEmpty()){
            int u = pq.poll();
            for(int v=0; v< Edges; v++)
                if(graph[u][v]!=0 && key[v]>graph[u][v] && !visited[u]){
                    key[v] = graph[u][v];
                    pq.add(v);
                    parent[v] = u;
                }
            visited[u] = true;
        }

        for(int i=1; i<Edges; i++)
            System.out.format("%d - %d - %d%n", i, parent[i], key[i]);
    }
}
