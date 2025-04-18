/*

Method 1: Topological Sort
Using degree array to record the out-degree, neighbors map to record In-neighbors(for example 0->1, 2->1, map(1) = [0, 2]).
Add the node whose out-degree is 0 into queue and result Set, then process each node in the queue, if the out-degree of one node becomes 0, add it to queue until queue is empty.

https://leetcode.com/problems/find-eventual-safe-states/discuss/120633/Java-Solution-(DFS-andand-Topological-Sort)
*/
package safestates_802;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Sol {
  public static void main(String[] args) {
    int[][] graph = {{},{0,2,3,4},{3},{4},{}};
    System.out.println(new Sol().eventualSafeNodes(graph));
  }

  public List<Integer> eventualSafeNodes(int[][] graph) {
    Map<Integer, Set<Integer>> neighbours = new HashMap<Integer, Set<Integer>>();
    int[] order = new int[graph.length];
    
    for(int i=0; i<graph.length; i++) 
      for(int neighbour : graph[i]) {
        if(!neighbours.containsKey(neighbour))
          neighbours.put(neighbour, new HashSet<Integer>());
        neighbours.get(neighbour).add(i);
        order[i]++;
      }
    Set<Integer> result = new HashSet<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();
    
    for(int i=0; i<order.length; i++) {
      if(order[i]==0) {
        result.add(i);
        q.add(i);
      }
    }
    
    while(!q.isEmpty()) {
      int num = q.poll();
      result.add(num);
      if(!neighbours.containsKey(num)) continue;
      for(int x : neighbours.get(num)) {
        if(--order[x]==0) {
          q.offer(x);
        }
      }
    }
    List<Integer> returnValue = new ArrayList(result);
    Collections.sort(returnValue);
    return returnValue;
  }
}
