package bestimetobuystockII_122;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/discuss/39564/Another-accepted-Java-solution
 */

public class greedy_jeantimex {

	public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) 
            profit += Math.max(0, prices[i] - prices[i - 1]);
        
        return profit;
    }
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(new greedy_jeantimex().maxProfit(prices));
	}
}
