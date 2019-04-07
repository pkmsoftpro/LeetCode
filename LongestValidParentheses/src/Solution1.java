package longestvalidparentheses;

import java.util.Stack;

public class Solution2 {
	public int longestValidParentheses(String s) {
        if (s == null) return 0;
        int len = s.length();
        int max = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                    stack.pop();
                else
                    stack.push(i);
            }
        }
        if (stack.isEmpty()) return len;
        int l, r = len;
        while (!stack.isEmpty()) {
            l = stack.pop();
            max = Math.max(max, r - l - 1);
            r = l;
        }
        return max;
    }
    
    public static void main(String[] args) {
		//String s = "((()(())";
		//String s = "()(()";
		String s = ")())()()())()(";
		//String s = "()(()";
		Solution2 sol = new Solution2();
		System.out.println(sol.longestValidParentheses(s));
	}
}
