package com.palin;

public class MySol {
	public static void main(String[] args) {
		String s = "1234543";
		MySol sol = new MySol();
		System.out.println(sol.getPalin(s));
	}
	
	public String getPalin(String s) {
		if(s.length()==1) return s;
        StringBuilder rev = new StringBuilder(s).reverse();
		if(rev.toString().equals(s)) return s;
		s = populatehash(s);
		int start = 0;
		int end = 0;
		for(int i=0;i<s.length();i++){
			int j=1;
			while(i-j>=0 && i+j<s.length() && s.charAt(i-j)==s.charAt(i+j)){
				if(s.charAt(i-j)!='#' && s.charAt(i+j)!='#' && end-start<=2*j){
					start = i-j;
					end = i+j;
				}
				j++;
			}
		}
		String retval = s.substring(start,end+1).replace("#", "");
		return retval.length()==0?""+s.charAt(0):retval;
	}
	
	public String populatehash(String s){
		String retval = "";
		for(int i=0;i<s.length();i++){
			retval = retval + s.charAt(i)+"#";
		}
		retval = "#" + retval;
		return retval;
	}
}
