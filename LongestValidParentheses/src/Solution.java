
public class Solution {
	
	public int longestValidParentheses(String s) {
		while(s.charAt(0)==')'){
			s = s.substring(1);
		}
        int leftPar = 0;
        int validPar = 0;
        int retVal = 0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('){
        		leftPar++;
        	}
        	else if(s.charAt(i)==')'){
        		if(leftPar!=0){
        			leftPar--;
        			if(leftPar==0) validPar =0; 
        			validPar+=2;
        		}
        		if(i+1<s.length() && s.charAt(i+1)=='('){
        			if(retVal<validPar){
        				retVal = retVal + validPar;
        				validPar = 0;
        			}
        		}
        		
        	}
        }
		return validPar;
    }

	public static void main(String[] args) {
		//String s = "((()(())";
		//String s = "()(()";
		String s = ")))()())";
		Solution sol = new Solution();
		System.out.println(sol.longestValidParentheses(s));
	}
}
