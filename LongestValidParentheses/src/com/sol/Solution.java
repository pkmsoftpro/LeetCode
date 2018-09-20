package com.sol;

public class Solution {
	
	public int longestValidParentheses(String s, int count) {
		if(s.length()==0){
			return count;
		}
		if(s.charAt(0)== '(') {
			count++;
			s = s.substring(1);
		}
		else if(s.charAt(0)==')') {
			count--;
			s = s.substring(1);
		}
		count = longestValidParentheses(s, count);
		return count;
    }

	public static void main(String[] args) {
		//String s = "((()(())";
		//String s = "()(()";
		String s = ")))()()())()(";
		Solution sol = new Solution();
		System.out.println(sol.longestValidParentheses(s, 0));
	}
}

