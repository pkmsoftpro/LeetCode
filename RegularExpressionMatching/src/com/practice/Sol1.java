package com.practice;

public class Sol1 {
	public boolean isMatch(String s, String p) {
		/*for(int j=0;j<p.length();j++){
			if(!p.contains((""+s.charAt(j)).trim())){
				int m = p.indexOf(s.charAt(j));
				if(p.charAt(m+1)=='*'){
					p=p.replace(""+p.charAt(m)+p.charAt(m+1), "");
				}
			}
		}*/
		if (p.isEmpty() && s.isEmpty())
			return true;
		if (!p.isEmpty() && !s.isEmpty() && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
			if (p.length() > 1 && p.charAt(0) == '.' && p.charAt(1) != '*')
				return isMatch(s.substring(1), p.substring(1));
			if (p.length() >= 2 && p.charAt(1) == '*') {
				if(p.charAt(0)=='.'){
					return isMatch(removeDotKleene(s, '.', p), p.substring(2));
				}
				return isMatch(removeSame(s, p.charAt(0),p), p.substring(2));
			} else
				return isMatch(s.substring(1), p.substring(1));

		} else if(!p.isEmpty() && !s.isEmpty() && p.length()>1 && p.charAt(1)=='*'){
			return isMatch(s,p.substring(2));
		} else return false;
	}

	public String removeSame(String str, char c,String pattern) {
		String retval = str;
		if (c == '.') c = str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				if(retval.length()+1>=pattern.length()){
					retval = str.substring(i+1);
				} else break;
			} else break;
		}
		return retval;
	}
	
	public String removeDotKleene(String str,char c,String pattern){
		if(pattern.equals(".*")) return "";
		String retval = str;
		if(c=='.') c=str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				if(retval.length()+1>=pattern.length()){
					retval = str.substring(i+1);
				} else break;
			} else break;
		}
		return retval;
	}
	
	public static void main(String[] args) {
		Sol1 sol = new Sol1();
		/*System.out.println(sol.isMatch("abbbcd", "ab.*.*.*.*.*.*d"));*/
		System.out.println(sol.isMatch("aaa", "ab*a*c*a"));
	}
}
