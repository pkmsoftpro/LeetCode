package com.practice;

public class MySolution {
	
	public boolean isMatch(String text,String pattern){
		if(pattern.isEmpty() && text.isEmpty()) return true;
		if(text.charAt(0)==pattern.charAt(0)){
			if(pattern.length()>=2 && pattern.charAt(1)=='*'){
				return isMatch(removeSame(text,pattern.charAt(0)), pattern.substring(2));
			} else return isMatch(text.substring(1), pattern.substring(1));
		} else return false;
	}
	public String removeSame(String str,char c){
		String retval = null;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				retval = str.substring(i+1);
			} else break;
		}
		return retval;
	}
	public static void main(String[] args) {
		MySolution sol = new MySolution();
		System.out.println(sol.isMatch("abbcccccccccd", "ab*c*d"));
	}
}
