package LeetcodePatterns.dp.CoinChange_322;

import java.util.Arrays;

public class DP {


  public static void main(String[] args) {
    int[] coins = {3,7,405,436};
      //{1,2,5}; --11
      //{83, 186, 408, 419};    --6249  --20
      //{3,7,405,436}           --8839  --25
    int num = new DP().coinChange(coins, 8839);
    System.out.println(num);
  }
  
  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount+1];
    Arrays.fill(dp, -1);
    int result = compute(coins, amount, dp);
    return result;
  }

  private int compute(int[] coins, int amount, int[] dp) {
    if(amount==0)
      return 0;
    int count = Integer.MAX_VALUE;
    
    for(int i=0; i<coins.length; i++) {
      if(amount-coins[i]>=0) {
        
        int tempCount = 0;
        
        if(dp[amount-coins[i]]!=-1)
          tempCount = dp[amount-coins[i]];
        else
          tempCount = compute(coins, amount-coins[i], dp);
        
        if(tempCount != Integer.MAX_VALUE)
          count = Math.min(count, tempCount+1);
      }
    }
    return dp[amount] = count;
  }
}
