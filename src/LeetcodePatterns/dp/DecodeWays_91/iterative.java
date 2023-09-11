package LeetcodePatterns.dp.DecodeWays_91;

/*
 * https://leetcode.com/problems/decode-ways/discuss/30547/Java-1ms-very-easy-AC-saddlebackvariant
 */

public class iterative {

	public int numDecodings(String s) {
	    if(s.length() == 0) return 0;
	    int pre = 27, digit, answer = 0, first = 1, second = 1;
	    for(int i = s.length()-1; i >= 0; i--){
	        digit = s.charAt(i) - '0';
	        if(digit == 0) answer = 0;
	        else answer = first + (digit*10 + pre < 27 ? second : 0);
	        second = first; first = answer; pre = digit;
	    }
	    return answer;
	}

    public static void main(String[] args) {
		String s = "12012";
		System.out.println(new iterative().numDecodings(s));
	}
}

/*
/**
 * Dynamic Programming
 *
 * DP[i] = Number of ways to decode the string from 0 to i.
 *
 * DP[i] = DP[i-1] (when i is from 1 to 9) + DP[i-2] (when (i-1,i) is from 10 to
 * 26)
 *
 * Time Complexity: O(N)
 *
 * Space Complexity: O(1)
 *
 * N = Length of the input string.
 *
class bruteforce {
    public int numDecodings(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int pre = 1; // dp[i-2]
        int cur = 1; // dp[i-1]

        for (int i = 1; i < s.length(); i++) {
            int sum = 0; // dp[i]
            if (s.charAt(i) != '0') {
                sum = cur;
            }
            int num = Integer.parseInt(s.substring(i - 1, i + 1));
            if (num >= 10 && num <= 26) {
                sum += pre;
            }

            pre = cur;
            cur = sum;
        }

        return cur;
    }
}

*/




/**
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
If all of two adjacent digits in input are valid for a letter, it will be same as Fibonacci problem.
Example: input is "11111". Result is equal to "1111" plus "111".

Here is my Java code with comments. It may help you to understand it:

public int numDecodings(String s) {
  if (s == null || s.length() == 0 || s.startsWith("0") || s.matches(".*[^12]0.*"))
    return 0;
  int previousResult = 1;
  int result = 1;
  for (int i = 1; i < s.length(); i++) {
    int newResult;
    if (s.charAt(i) == '0') {
      // the last two digits must be converted together
      newResult = previousResult;
    } else if (s.charAt(i - 1) != '0' && Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
      // the last two digits may or may not be converted together
      newResult = previousResult + result;
    } else {
      // the last two digits cannot be converted together
      newResult = result;
    }
    previousResult = result;
    result = newResult;
  }
  return result;
}












*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*/