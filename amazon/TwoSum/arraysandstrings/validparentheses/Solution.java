package arraysandstrings.validparentheses;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
      if(s.length()==1) return false;
    Stack<Character> stack = new Stack<Character>();
    List<Character> list = Arrays.asList('}', ')', ']');
    for (int i = 0; i < s.length(); i++) {
      char atI = s.charAt(i);
      if (list.contains(atI)) {
        if (stack.isEmpty() || stack.peek() != getComplement(atI)) return false;
        else stack.pop();
      } else stack.push(atI);
    }
    return stack.isEmpty();
  }

  public char getComplement(char s) {
    if (s == '}') return '{';
    else if (s == ')') return '(';
    else return '[';
  }

  public static void main(String[] args) {
    String s = "){";
    System.out.println(new Solution().isValid(s));
  }
}
