package com.palin;

public class LongestPalin {
	public static void main(String[] args) {
		LongestPalin lp = new LongestPalin();
		System.out.println(lp.getLongestPalindrom("babab"));
	}
	
	public String getLongestPalindrom(String s){
		StringBuilder rev = new StringBuilder(s).reverse();
		if(rev.toString().equals(s)) return s;
		StringBuilder temp = null;
		String maxa = ""+s.charAt(0);
		for(int i=0;i<rev.length();i++){
			temp = new StringBuilder((""+rev.charAt(i)).trim());
			int j =i,m=0;
			while(s.contains(temp)){
				int t = j+ ++m;
				if(t<rev.length()){
					temp = temp.append(rev.charAt(t));
					if(maxa.length()<=temp.length() 
							&& s.contains(temp) 
							&& temp.toString().equals(new StringBuilder(temp).reverse().toString()))  
						maxa = temp.toString();
					if(maxa.length()==s.length())break;
				}
				else break;
			}
		}
		return maxa;
	}
}
