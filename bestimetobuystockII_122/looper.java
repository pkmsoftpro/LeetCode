package bestimetobuystockII_122;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/discuss/39531/Java-O(n)-solution-if-we're-not-greedy_jeantimex
 */
public class looper {

	public int maxProfit(int[] prices) {
	    int profit = 0, i = 0;
	    while (i < prices.length) {
	        // find next local minimum
	        while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
	        int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
	        // find next local maximum
	        while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
	        profit += i < prices.length ? prices[i++] - min : 0;
	    }
	    return profit;
	}
}
