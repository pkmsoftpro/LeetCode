import java.util.*;

public class Solution {

  public boolean canFinish(int numCourses, @org.jetbrains.annotations.NotNull int[][] prerequisites) {
    boolean retval = true;
    if(prerequisites.length==0) return true;
    if(prerequisites.length==1){
      if(prerequisites[0].length==0) return true;
      return prerequisites[0][0]!=prerequisites[0][1];
    }
    boolean[] visited = new boolean[numCourses];
    boolean[] possible = new boolean[numCourses];
    LinkedList[] adjList = new LinkedList[numCourses];
    for(int i=0; i<numCourses; i++){
      adjList[i] = new LinkedList();
    }
    for(int i=0; i<prerequisites.length; i++){
      if(prerequisites[i][0] == prerequisites[i][1]) return false;
    }

    createAdjList(adjList, prerequisites);
    for(int i=0; i<numCourses; i++){
      if(!visited[i] && checkIterate(adjList, possible, visited, i)) return false;
    }

    return true;
  }

  public boolean checkIterate(LinkedList[] adjList, boolean[] possible, boolean[] visited, int cand){
    if(visited[cand]) return false;
    possible[cand] = true;
    visited[cand] = true;
    List<Integer> candAdj = adjList[cand];
    for( Integer u : candAdj)
      if(possible[u] || checkIterate(adjList, possible, visited, u))
        return true;
    return possible[cand] = false;
  }

  public void createAdjList(LinkedList[] adjList, int[][] pre) {
    for (int[] elem : pre)
      adjList[elem[0]].add(elem[1]);
  }

  public static void main(String[] args) {
    int[][] pre2 = {{1, 0}};
    int[][] pre = {{1, 0}, {0, 1}};
    int[][] pre1 = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 0}};
    int[][] pre3 = {{}};
    int[][] pre4 = {{0,10},{3,18},{5,5},{6,11},{11,14},{13,1},{15,1},{17,4}};
    int[][] pre5 = {{2,0},{1,0},{3,1},{3,2}};

    int[][] prex = {{0,2},{0,3},{1,3},{1,4},{2,5},{5,4}};
    int[][] prey = {{0,2},{3,0},{1,3},{4,1},{2,5},{5,4}};
    int[][] prez = {{0,3},{1,3},{2,0},{2,1}};

    System.out.println(new Solution().canFinish(4, prez));
  }
}
