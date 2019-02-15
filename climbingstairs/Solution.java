package climbingstairs;

public class Solution {

	public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        if(n>0)dp[1]=1;
        if(n>1)dp[2]=2;
        if(n>2)dp[3]=3;
        for(int i=4;i<n+1;i++){
        	dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().climbStairs(7));
	}
}
