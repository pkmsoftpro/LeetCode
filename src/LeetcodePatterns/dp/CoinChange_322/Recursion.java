package LeetcodePatterns.dp.CoinChange_322;

import java.util.Arrays;

// TODO: Iterative
// https://leetcode.com/problems/coin-change/solutions/2058925/java-dynamic-programming-3-simplest-solutions/

public class Recursion {
  int k = 0;
  public static void main(String[] args) {
    int[] coins = {3,7,405,436};
      //{1,2,5}; --11
      //{83, 186, 408, 419};    --6249  --20
      //{3,7,405,436}           --8839  --25
    int num = new Recursion().coinChange(coins, 8839);
    System.out.println(num);
  }
  
  public void reverseArray(int[] coins, int lo, int hi) {
    while(lo<hi) {
      int temp = coins[lo];
      coins[lo] = coins[hi];
      coins[hi] = temp;
      lo++;
      hi--;
    }
  }
  
  public int coinChange(int[] coins, int amount) {
    Arrays.sort(coins);
    reverseArray(coins, 0, coins.length-1);
    int[] count = new int[amount+1];
    int res = recursion(coins, amount, 0, count);
    return res == Integer.MAX_VALUE ? -1 : k;
}
  
  public int recursion(int[] coins, int n, int number, int[] count){
    if(n == 0) {
      k = number;
      return number;
    }
    if(n<0)
        return Integer.MAX_VALUE;
    if(count[n] == number && number!=0) return number;
    if(k!=0 && number>=k) return number;
    int res = Integer.MAX_VALUE;
    for(int i=0; i<coins.length; i++)
        res = Math.min(res, recursion(coins, n-coins[i], number+1, count));
    count[n] = number;
    return res;
}

  
}
