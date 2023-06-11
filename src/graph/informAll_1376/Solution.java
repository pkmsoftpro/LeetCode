package graph.informAll_1376;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  int retVal;
  public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
    
    ArrayList[] adjList = new ArrayList[n];
    
    for(int i=0; i<n; i++) {
      adjList[i] = new ArrayList();
    }
    
    for(int i=0; i<n; i++) {
      if(manager[i]==-1) continue;
      adjList[manager[i]].add(i);
    }
    
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(headID);
    
    return getMaxInterval(adjList, queue, 0, informTime);
  }
  
  public int getMaxInterval(ArrayList[] adjList, Queue<Integer> queue, int sumTime, int[] informTime) {
    
    while(!queue.isEmpty()) {
      int curr = queue.poll();
      
      sumTime = sumTime + informTime[curr];
      
      if(adjList[curr].isEmpty()) {
        retVal = Math.max(retVal, sumTime);
      }
      
      for(int i : (ArrayList<Integer>)adjList[curr]) {
        queue.add(i);
        getMaxInterval(adjList, queue, sumTime, informTime);
      }
    }
    
    return retVal;
  }
  
  public static void main(String[] args) {
    int n = 12;
    int headId = 3;
    
    int[] manager = {3,4,0,-1,6,0,7,5,0,2,2,8};
    int[] informTime = {5,1,0,2,1,4,1,2,5,11,12,8};
    
    System.out.println(new Solution().numOfMinutes(n, headId, manager, informTime));
  }
}
