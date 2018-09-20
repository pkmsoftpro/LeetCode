package com.geeksforgeeks.onesubseqoftwo;

public class OneSubsequenceOf2 {
	String lSeq = "";

	public boolean checkSubsequence(String s1, String s2) {

		if (s1 == null || s2 == null) {
			return false;
		}
		if (s1.isEmpty()) {
			return true;
		}
		if (s2.contains(String.valueOf(s1.charAt(0)))) {

			lSeq = lSeq + s1.charAt(0);
			int s2Index = s2.indexOf(s1.charAt(0));
			s2 = s2.substring(s2Index+1);
			s1 = s1.substring(1);
			return checkSubsequence(s1, s2);
		}
		else return false;
	}
	
	public String prepareString(String s1,String s2, int s2len){
		String retVal = "";
		for(int i=0;i<s2len;i++){
			if(s1.contains(String.valueOf(s2.charAt(i)))){
				retVal = retVal + s2.charAt(i);
			}
		}
		return retVal;
	}
	
	public static void main(String[] args) {
		OneSubsequenceOf2  os = new OneSubsequenceOf2();
		//String s2 = os.prepareString("AXY", "YADXCP", "YADXCP".length());
		String s1 = "gksrek";
		String s2 = "geeksforgeeks";
		System.out.println("match: " + os.checkSubsequence(s1, s2));
		System.out.println(s1 + " " + s2 + ", sequence is: " + os.lSeq);
	}
}
