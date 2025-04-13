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
/*
https://www.youtube.com/watch?v=cpfIx7jqqu8

import java.util.*;

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i=0; i<manager.length; i++){
            if(adjList.get(manager[i])==null){
                adjList.put(manager[i], new ArrayList<>());
            }
            adjList.get(manager[i]).add(i);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(headID);

        int maxTime = 0;
        while(!queue.isEmpty()){
            int managerId = queue.poll();
            if(adjList.containsKey(managerId)){
                for(int emp : adjList.get(managerId)){
                    informTime[emp] = informTime[emp] + informTime[manager[emp]];
                    queue.offer(emp);
                    maxTime = Math.max(maxTime, informTime[emp]);
                }
            }
        }
        return maxTime;
    }

    public static void main(String[] args) {

        int n = 9;
        int headId = 2;
        int[] manager = {2,2,-1,2,2,2,1,3,6};
        int[] informTime = {0,3,2,20,0,0,4,0,0};
        System.out.println(new Solution().numOfMinutes(n, headId, manager, informTime));
    }
}

*/


