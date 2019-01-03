package validparentheses;

import java.util.Stack;

public class Solution {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(stack.size()==0 && i<s.length()){
				stack.add(s.charAt(i));
			}
			else if(openbracket(s.charAt(i))){
				stack.push(s.charAt(i));
			}
			else if(closebracket(s.charAt(i)) 
					&& (getComplement(s.charAt(i-1))==s.charAt(i) ||
					stack.peek()==getComplement(s.charAt(i)))){
				stack.pop();
			}	
			else return false;
		}
		
		if (stack.size()==0) return true;
		
		return false;
	}
	
	public static boolean openbracket(char c){
		 if(c=='{' || c=='(' || c=='['){
			 return true;
		 }
		 return false;
	}
	
	public static boolean closebracket(char c){
		 if(c=='}' || c==')' || c==']'){
			 return true;
		 }
		 return false;
	}
	 
	 public static char getComplement(char c){
		 if(c=='(') return ')';
		 else if(c==')') return '(';
		 else if(c=='{') return '}';
		 else if(c=='}') return '{';
		 else if(c=='[') return ']';
		 else if(c==']') return '[';
		 return 'a';
	 }
	 
	 public static void main(String[] args) {
		String str = "{[]}";
		System.out.println(isValid(str));
	}
}
