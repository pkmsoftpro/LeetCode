package com.parantheses;

import java.util.List;

public class RecursiveParentheses {
	public static void main(String[] args) {
		Solution sol = new Solution();
		List<String> list = sol.generateParenthesis(4);
		System.out.println(list);
	}
}
