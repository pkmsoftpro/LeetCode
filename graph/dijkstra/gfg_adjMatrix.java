// Java program for the above approach
import java.util.*;

class GFG {
    private static final int INF = 0x3f3f3f3f;

    // To add an edge
    static void
    addEdge(List<List<Pair<Integer, Integer> > > adj, int u,
            int v, int wt)
    {
        adj.get(u).add(new Pair<>(v, wt));
        adj.get(v).add(new Pair<>(u, wt));
    }

    // Prints shortest paths from src to all other vertices
    static void
    shortestPath(List<List<Pair<Integer, Integer> > > adj,
                 int V, int src)
    {
        // Create a priority queue to store vertices that
        // are being preprocessed.
        PriorityQueue<Pair<Integer, Integer> > pq
                = new PriorityQueue<>(
                Comparator.comparingInt(Pair::getFirst));

        // Create a list for distances and initialize all
        // distances as infinite (INF)
        List<Integer> dist
                = new ArrayList<>(Collections.nCopies(V, INF));

        // Insert source itself in priority queue and
        // initialize its distance as 0.
        pq.add(new Pair<>(0, src));
        dist.set(src, 0);

        /* Looping till priority queue becomes empty (or all
        distances are not finalized) */
        while (!pq.isEmpty()) {
            // The first vertex in pair is the minimum
            // distance vertex, extract it from priority
            // queue.
            int u = pq.peek().getSecond();
            pq.poll();

            // Get all adjacent of u.
            for (Pair<Integer, Integer> x : adj.get(u)) {
                // Get vertex label and weight of current
                // adjacent of u.
                int v = x.getFirst();
                int weight = x.getSecond();

                // If there is a shorter path to v through
                // u.
                if (dist.get(v) > dist.get(u) + weight) {
                    // Updating distance of v
                    dist.set(v, dist.get(u) + weight);
                    pq.add(new Pair<>(dist.get(v), v));
                }
            }
        }

        // Print shortest distances stored in dist[]
        System.out.println("Vertex \tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.printf("%d \t\t %d\n", i,
                    dist.get(i));
        }
    }

    // Driver program to test methods of graph class
    public static void main(String[] args)
    {
        int V = 9;
        List<List<Pair<Integer, Integer> > > adj
                = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Making the above-shown graph
        addEdge(adj, 0, 1, 4);
        addEdge(adj, 0, 7, 8);
        addEdge(adj, 1, 2, 8);
        addEdge(adj, 1, 7, 11);
        addEdge(adj, 2, 3, 7);
        addEdge(adj, 2, 8, 2);
        addEdge(adj, 2, 5, 4);
        addEdge(adj, 3, 4, 9);
        addEdge(adj, 3, 5, 14);
        addEdge(adj, 4, 5, 10);
        addEdge(adj, 5, 6, 2);
        addEdge(adj, 6, 7, 1);
        addEdge(adj, 6, 8, 6);
        addEdge(adj, 7, 8, 7);

        shortestPath(adj, V, 0);
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public U getSecond() { return second; }
}
