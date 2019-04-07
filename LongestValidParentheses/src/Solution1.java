package longestvalidparentheses;

import java.util.Stack;

public class Solution1 {
	public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }else{//s.charAt(i) == ')'
                if (!stack.isEmpty()){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    stack.push(i);
                }else{
                    max = Math.max(max, i-stack.peek());
                }
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
		//String s = "((()(())";
		//String s = "()(()";
		String s = ")())()()())()(";
		//String s = "()(()";
		Solution1 sol = new Solution1();
		System.out.println(sol.longestValidParentheses(s));
	}
}
