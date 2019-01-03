//https://leetcode.com/problems/generate-parentheses/discuss/10162/*Java*-Easy-to-understand-recursive-DP-method-with-explanations

/*
 * 	For each valid parenthesis, there must be a pair whose right parenthesis is at the rightmost location. 
 *  Thus, a valid parenthesis has to be of the following form:
 *  * ( * )
 *  where * denotes the remaining parentheses which are don't yet know (* can be empty, i.e., with 0 pair of parenthesis). 
 *  However, we do know the following two important facts:
 *  	both two * are valid parentheses;
 *  	they don't overlap at all! (a pair has to be either on the left side or inside (), 
 *  	but cannot be the case where ( is on the left side and ) is inside ())
 *  If we put i parentheses inside (), there are n-i-1 to be put on the left side. This gives us a recursive formula as below:
 *  P(n) = P(n-i-1) x P(i)
 *  where P(n) are all valid parentheses with n parentheses.
 *  To this point, we are done with the algorithm, the only remaining task is coding, which is given below:
 */
package generateparentheses22;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {

	public static List<String> generateParenthesis(int n) {
		@SuppressWarnings("unchecked")
		List<String>[] lists = new LinkedList[n+1]; // store all P(k)'s for k=0,1,...,n
		return helper(n, lists);
	}

	private static List<String> helper(int n, List<String>[] lists) {
		if(lists[n]!=null) return lists[n]; // if computed, reuse
		List<String> res = new LinkedList<String>();
		if(n<=0) {
			lists[0] = new LinkedList<String>(Arrays.asList(""));
			return lists[0];
		}
		else if(n==1) {
			lists[1] = new LinkedList<String>(Arrays.asList("()"));
			return lists[1];
		}
		// the following simply implements the recursive formula derived above
	    for(int i=0; i<=n-1; i++) {
	    	List<String> left = helper(n-i-1, lists);
	    	List<String> inside = helper(i, lists);
	    	for(String str1 : left) {
	    		for(String str2 : inside) {
	    			res.add(str1 + "(" + str2 + ")");
	    		}
	    	}
	    }
	    lists[n] = res; // store computed results for reuse
	    return res;
	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
}
