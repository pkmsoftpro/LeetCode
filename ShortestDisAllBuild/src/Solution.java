import java.util.Queue;


// https://www.programcreek.com/2014/05/leetcode-shortest-distance-from-all-buildings-java/
// https://www.programcreek.com/2014/07/leetcode-shortest-word-distance-ii-java/
// https://www.geeksforgeeks.org/minimum-cost-to-reach-the-top-of-the-floor-by-climbing-stairs/
// https://www.youtube.com/watch?v=8K98WexA8m8

// https://github.com/jzysheep/LeetCode/blob/master/317.%20Shortest%20Distance%20from%20All%20Buildings.cpp#L9
public class Solution {
	
	private int shortestDistance(int[][] grid){
		
		int buildings = 0;
		int hits = 0;
		int[][] hit = new int[3][5];
		int[][] distSum = new int[3][5];
		int[][] visited = visited(grid);
		
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;i++){
				if(grid[i][j] == 1){
					buildings++;
				}
			}
		}
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;i++){
				if(grid[i][j]==1){
					if(!bfs(grid, buildings,visited,grid.length,grid[0].length)){
						return -1;
					}
				}
			}
		}
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;i++){
				if(hits == buildings){
					//minDistance = Math.min(minDistance, 1);
				}
			}
		}
		
		
		return 0;
	}
	
	private boolean bfs(int[][] grid, int buildings, int[][] visited, int i, int j){
		
		int countBuild = 0;
		
		
		return countBuild==buildings;
	}
	
	private void visit(int[][] grid, boolean[][] visited, int hits, Queue<Integer> q){
		
	}
	
	private int[][] visited(int[][] visited){
		for(int i=0;i<visited.length;i++){
			for(int j=0;j<visited[0].length;i++){
				visited[i][j] = 0;
			}
		}
		return visited;
	}
	
	private void initGrid(int[][] grid){
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;i++){
				grid[i][j] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] grid = new int[3][5];
		Solution sol = new Solution();
		sol.initGrid(grid);
		grid[0][0] = 1;
		grid[0][4] = 1;
		grid[2][2] = 1;
		grid[0][2] = 2;
		
		System.out.println(sol.shortestDistance(grid));		
	}
}
