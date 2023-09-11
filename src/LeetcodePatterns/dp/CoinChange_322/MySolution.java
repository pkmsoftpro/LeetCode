package LeetcodePatterns.dp.CoinChange_322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.PrintJavaFunction;

public class MySolution {
    int retVal = Integer.MAX_VALUE, ret = -1;
    int k =0;
  public static void main(String[] args) {
    int[] coins = {83, 186, 408, 419};
      //{1,2,5}; --11
      //{83, 186, 408, 419};    --6249
    int num = new MySolution().coinChange(coins, 6249);
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
    if(amount==0) return amount;
    Arrays.sort(coins);
    reverseArray(coins, 0, coins.length-1);
    int[] count = new int[amount+1];
    compute(coins, amount, 0, new HashSet<Integer>(), new ArrayList<Integer>(), count);
    return ret==-1?-1:retVal;
  }
  
  public void compute(int[] coins, int amount, int count, Set<Integer> memo, List<Integer> list, int[] count2) {
    if(amount<0) {
      count--;
      return;
    }
    if(memo.contains(amount)) 
      return;
    if(count2[amount] == amount && amount!=0) return;
    if(k!=0 && amount>=k) return;
    for(int i=0; i<coins.length;) {
      list.add(coins[i]);
      count++;
      amount = amount-coins[i];
      if(amount==0) {
        k = count;
        PrintJavaFunction.printList(list);
        System.out.println();
        ret = 0;
        retVal = Math.min(retVal, count);
        System.out.println(retVal);
        return;
      }
      compute(coins, amount, count, memo, list, count2);
      if(amount<0) return;
      count2[amount] = amount;
      list.remove(list.size()-1);
      memo.add(amount);
      count--;
      amount = amount+coins[i];
      i++;
    }
  }
}
