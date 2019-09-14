//http://leetcodesolution.blogspot.com/2015/01/leetcode-dungeon-game.html
//http://leetcodesolution.blogspot.com/


public class Solution2 {

	int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] minInitHealth = new int[m][n];
        for(int i=m-1; i>=0; i--)
        {
            for (int j=n-1; j>=0; j--)
            {
                if (i == m-1 && j == n-1)
                {
                    minInitHealth[i][j] = Math.max(1, 1 - dungeon[i][j]);
                }  
                else if (i == m-1)
                {
                    minInitHealth[i][j] = Math.max(1, minInitHealth[i][j+1] - dungeon[i][j]);
                }  
                else if (j == n-1)
                {
                    minInitHealth[i][j] = Math.max(1, minInitHealth[i+1][j] - dungeon[i][j]);
                }  
                else
                {
                    minInitHealth[i][j] = Math.max(1, Math.min(minInitHealth[i+1][j],minInitHealth[i][j+1]) - dungeon[i][j]);
                }  
            }
        }
        
        return  minInitHealth[0][0];
    }
	
	public static void main(String[] args) {
    	Solution2 sol = new Solution2();
		int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
    	//int[][] arr = {{-3,5}};
    	//int[][] arr = {{0,5},{-2,-3}};
		System.out.println(sol.calculateMinimumHP(arr));
	}
}
