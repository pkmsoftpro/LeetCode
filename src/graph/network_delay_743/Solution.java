package graph.network_delay_743;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public int networkDelayTime(int[][] times, int n, int k) {
    k = k-1;
    int[] time = new int[n];
    for(int i=0; i<n; i++)
      time[i] = Integer.MAX_VALUE;
    Graph g = new Graph(times, n);
    time[k] = 0;
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(k);
    int timeSum = 0;
    while(!queue.isEmpty()) {
      int qsize = queue.size();
      
      for(int m=0; m<qsize; m++) {
        int curr = queue.poll();
        
        for(Object obj : g.adj[curr]) {
          Edge t = (Edge) obj;
          if(time[t.e] > time[curr] + t.w) {
            time[t.e] = time[curr] + t.w;
            queue.add(t.e);
          }
        }
        
      }
      
    }
    
    for(int i=0; i<n; i++) {
      if(time[i]==Integer.MAX_VALUE) return -1;
      timeSum = Math.max(timeSum, time[i]);
    }
    
    return timeSum;
  }
  
  class Edge {
    public int s,e,w;
    
    public Edge(int s, int e, int w) {
      this.s = s;
      this.e = e;
      this.w = w;
    }
    
    @Override
    public String toString() {
      return "s:" + s + " e:" + e + " w:" + w;
    }
  }
  
  class Graph {
    public int vertices;
    public LinkedList[] adj;
    
    public Graph(int[][] times, int n) {
      vertices = n;
      adj = new LinkedList[n];
      
      for(int i=0; i<n; i++) {
        adj[i] = new LinkedList<Integer>();
      }
      
      for(int[] time : times) {
        adj[time[0]-1].add(new Edge(time[0]-1, time[1]-1, time[2]));
      }
    }
  }
  
  public static void main(String[] args) {
    int[][] times = {{1,2,1},{2,1,3}};
      //2 :: {{2,1,1},{2,3,1},{3,4,1}}; 4, 2
    int n = 2, k = 2;
    System.out.println(new Solution().networkDelayTime(times, n, k));
  }
}