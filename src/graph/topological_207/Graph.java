package graph.topological_207;

//A Java program to print topological
//sorting of a DAG
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

//This class represents a directed graph
//using adjacency list representation
public class Graph {
 // No. of vertices
 private int V;

 // Adjacency List as ArrayList of ArrayList's
 private Map<Integer, List<Integer>> adj;
 
 // Constructor
 Graph(int v)
 {
     V = v;
     adj = new HashMap<Integer, List<Integer>>();
 }

 // Function to add an edge into the graph
 void addEdge(int v, int w) { 
   
   adj.computeIfAbsent(v, m->new ArrayList<Integer>()).add(w);
   adj.computeIfAbsent(w, m->new ArrayList<Integer>());
 }

 // A bruteforce function used by topologicalSort
 void topologicalSortUtil(int v, boolean visited[],
                         Stack<Integer> stack)
 {
     // Mark the current node as visited.
     visited[v] = true;
     Integer i;

     // Recur for all the vertices adjacent
     // to thisvertex
     Iterator<Integer> it = adj.get(v).iterator();
     while (it.hasNext()) {
         i = it.next();
         if (!visited[i])
             topologicalSortUtil(i, visited, stack);
     }

     // Push current vertex to stack
     // which stores result
     stack.push(new Integer(v));
 }

 // The function to do Topological Sort.
 // It uses bruteforce topologicalSortUtil()
 void topologicalSort()
 {
     Stack<Integer> stack = new Stack<Integer>();

     // Mark all the vertices as not visited
     boolean visited[] = new boolean[V];
     for (int i = 0; i < V; i++)
         visited[i] = false;

     // Call the bruteforce helper
     // function to store
     // Topological Sort starting
     // from all vertices one by one
     for (int i = 0; i < V; i++)
         if (visited[i] == false)
             topologicalSortUtil(i, visited, stack);

     // PrintJavaFunction contents of stack
     while (stack.empty() == false)
         System.out.print(stack.pop() + " ");
 }
 
 public boolean cycleDetection(boolean[] visited, int v, Stack<Integer> stack) {
   if(visited[v]) return true;
   visited[v] = true;
   List<Integer> list = adj.get(v);
   for(int i : list) {
     boolean m  = cycleDetection(visited, i, stack);
     return m;
   }
   stack.push(v);
   return false;
 }

 // Driver code
 public static void main(String args[])
 {
     // Create a graph given in the above diagram
     Graph g = new Graph(6);
     g.addEdge(5, 2);
     g.addEdge(5, 0);
     g.addEdge(4, 0);
     g.addEdge(7, 4);
     g.addEdge(2, 3);
     g.addEdge(3, 7);

     System.out.println("Following is a Topological "
                     + "sort of the given graph");
     // Function Call
     //g.topologicalSort();
     
     
     Stack<Integer> stack = new Stack<Integer>();
     int i=0;
     boolean t = false;
     boolean visited[] = new boolean[2000];
     for(Entry<Integer, List<Integer>> map : g.adj.entrySet()) {
       
       boolean m= false;
       if(!visited[map.getKey()]) {
         m = g.cycleDetection(visited, map.getKey(), stack);
         System.out.println(m);
       }
         
     }
     
 }
}
//This code is contributed by Aakash Hasija
