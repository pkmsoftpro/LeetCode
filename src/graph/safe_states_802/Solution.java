package graph.safe_states_802;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  
  public List<Integer> eventualSafeNodes(int[][] graph) {
    
    int[] color = new int[graph.length];
    List<Integer> safeNodes = new ArrayList<Integer>();

    
    for(int j=0; j<graph.length; j++) {
      if(color[j]==1 || evaluateNode(graph, j, color))
        safeNodes.add(j);
    }
    
    return safeNodes;
  }
  
  public boolean evaluateNode(int[][] graph, int i, int[] color) {
    if(color[i]!=0) return color[i]==1;
    color[i] = 2;
    
    for(int t : graph[i]) {
      if(!evaluateNode(graph, t, color)) return false;
    }
    
    color[i] = 1;
    
    return true;
  }

  public static void main(String[] args) {
    int[][] graph = {{},{0,2,3,4},{3},{4},{}};
      
      //{{1,2},{2,3},{5},{0},{5},{},{}};
    
    System.out.println(new Solution().eventualSafeNodes(graph));
  }
}
