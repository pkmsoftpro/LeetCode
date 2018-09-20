package com.versionComparison;

import java.util.StringTokenizer;

public class Solution {
	
	/*public int compareVersion(String version1, String version2) {
        if(version1.equals(version2)) return 0;
		StringTokenizer st1 = new StringTokenizer(version1, ".");
		StringTokenizer st2 = new StringTokenizer(version2, ".");
		int[] s1 = new int[st1.countTokens()];
		int[] s2 = new int[st2.countTokens()];
		if(s1.length==0 || s2.length==0){
			return 0;
		}
		int x = 0;
		while(st1.hasMoreElements()){
			String string1 = st1.nextToken();
			s1[x] = Integer.parseInt(string1);
			x++;
		}
		x =0;
		while(st2.hasMoreElements()){
			String string2 = st1.nextToken();
			s2[x] = Integer.parseInt(string2);
			x++;
		}
		
		int count = 0;
		for(int i=0; i<s1.length; i++){
			if(i<s2.length && s1[i]>s2[i]){
				return 1;
			} if(i<s2.length && s1[i]==s2[i]){	 this if condition is for 1.1 and 1.0
				count++;
			}
			if(i<s2.length && s1[i]<s2[i] && count<=i){
				return -1;
			}
		}
		//if(s1.length>s2.length) return 1;
		for(int i=0; i<s2.length; i++){
			try{
				if(i<s2.length && s1[i]<s2[i]){
					return -1;
				}
			} catch(Exception e){
				int t = new Integer(s2[i]);
				if(t==0 && s2.length<=i+1) return 0;
				return -1;
			}
		}
		
		
		 * condition to check if both strings are same.
		 * the below condition is required for the following condition 
		 * Input:
			"01"
			"1"
		 
		int m = 0;
		for (int i = 0; i < s1.length; i++) {
			
			 * try catch is required in case of s2 length is smaller than s1
			 * Last executed input:
				"1.1"
			    "1"
			 
			try{
				if (s1[i] == s2[i]) {
					m++;
				}
			} catch(Exception e){
				int t = new Integer(s1[i]);
				if(t==0 && s1.length<=i+1) return 0;
				return 1;
			}
		}
		if(s2.length>m) return -1;
		else if(m==s1.length){
			return 0;
		}
		return 1;
    }
	
	private boolean containsMultipleZeroes(String str){
		int zero = Integer.parseInt(str);
		if(zero == 0 && str.length()>1){
			return true;
		}
		return false;
	}*/
	
	public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");   // to divide the string
        String[] s2 = version2.split("\\.");
        int len = s1.length > s2.length ? s1.length : s2.length;  //find the max length;
        for (int i = 0; i < len; i++) {
            int s1Value = i < s1.length ? Integer.valueOf(s1[i]) : 0; // transform the string to integer
            int s2Value = i < s2.length ? Integer.valueOf(s2[i]) : 0;
            if (s1Value > s2Value) { 
                return 1;
            } else if (s1Value < s2Value) {
                return -1;
            } else {
                continue; // s1Value == s2Value, to continue the next loop
            }
        }
        return 0;
        
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s1 = "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.00.1";
		String s2 = "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0";
		/*System.out.println(sol.compareVersion("1.1", "1"));
		System.out.println(sol.compareVersion("0.1", "1.1"));
		System.out.println(sol.compareVersion("1", "1.1"));
		System.out.println(sol.compareVersion("1.1", "1.0"));
		System.out.println(sol.compareVersion("1.0", "1"));
		System.out.println(sol.compareVersion("1.0.1", "1"));
		System.out.println(sol.compareVersion("1", "1.0"));*/
		System.out.println(sol.compareVersion(s1, s2));
	}
}
