package uniquepaths;

/*
 * good techers:
 * https://www.youtube.com/watch?v=getrj0j1Krg
 * 
 */
public class dynamicprogramming {
    public int uniquePaths(int m, int n) {
        //this is a classic dynamic programming interview question
        //initialise a dp array of mxn size that would be used to store the number of ways taken to reach a cell
        int[][] dp = new int[m][n];
        
        // initialise all the elements of dp of first row as 1 since there are only 1 ways to reach that cell given that
        // robot can move either right or down
        for(int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        //similarly initialize all the elements of dp of first column as 1 since there are only 1 way to reach that cell given that
        //robot can move either right or down
        for(int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }
        
        //next we start filling the cells with the number of ways robot can reach there,
        //for example, talking about cell[1][1], the number of ways bot can reach there is through up or down, hence 
        // the number of ways we can reach cell[1][1] is by adding the value at index cell 0,1 and 1,0.
        //there fore we derived this formuala
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        //the last cell will have the nmber of ways to reach that cell 
        return dp[m-1][n-1];
    }
    
    public static void main(String[] args) {
		System.out.println(new dynamicprogramming().uniquePaths(1,3));
	}
}