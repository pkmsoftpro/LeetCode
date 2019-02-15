package minimumwidthpath;

public class Solution {

    public int minPathSum(int[][] grid) {
    	int x = grid.length;
    	int y = grid[0].length;
        int[][] dp = new int[x][y];
        dp[0][0]=grid[0][0];
        for(int i=1;i<x;i++){
        	dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<y;i++){
        	dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<x;i++){
        	for(int j=1;j<y;j++){
        		dp[i][j]=(dp[i-1][j]<dp[i][j-1])?(grid[i][j]+dp[i-1][j]):(dp[i][j-1]+grid[i][j]);
        	}
        }
    	return dp[x-1][y-1];
    }
    
    public static void main(String[] args) {
		int[][] grid = {
			  {1,3,1},
			  {1,5,1},
			  {4,2,1}
			};
		System.out.println(new Solution().minPathSum(grid));
	}
}

/*
 * public int backtrack(int[][] grid, int x,int y, int minweight){
    	while(x<grid.length && y<grid[0].length){
    		int result = grid[0][0];
        	if(grid[0].length-1==y && grid.length-1==x){
        		if(minweight>result){
        			return minweight;
        		}
        	}
        	if(y>grid[0].length || x>grid.length) return 0;
        	if(x<0 || y<0) return 0;
    		return backtrack(grid, x - 1, y, minweight)
    				+ backtrack(grid, x, y - 1, minweight)
    				+ backtrack(grid, x + 1, y, minweight)
    				+ backtrack(grid, x, y + 1, minweight);
    	}
    	return minweight;
    }
 */
