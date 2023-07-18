package LeetcodePatterns.Generate_Parentheses_22;

// https://leetcode.com/problems/generate-parentheses/solutions/10100/easy-to-understand-java-backtracking-solution/

import java.util.ArrayList;
import java.util.List;

import util.Print;

public class Solution {

  public static void main(String[] args) {
    int n = 3;
    List<String> parens = new Solution().generateParenthesis(n);
    Print.printList(parens);
  }

  public List<String> generateParenthesis(int n) {
    List<String> parens = new ArrayList<String>();
    compute(n, "", parens, 0, 0);
    return parens;
  }

  public void compute(int max, String paren, List<String> parens, int open, int close) {

    if (paren.length() == 2*max) {
      parens.add(paren);
      return;
    }

    if(open<max)
      compute(max, paren+"(", parens, open+1, close);
    if(close<open)
      compute(max, paren+")", parens, open, close+1);
  }
}
