package com.geeksforgeeks.allsubsequence;

import java.util.HashSet;

public class SubSequence {
	
	HashSet<String> subSeq = new HashSet<String>();
	private void subSequence(String str){
		for(int i=0; i<str.length();i++){
			
			for(int j=str.length();j>i;j--){
				String sub_str = str.substring(i,j);
				
				if(!subSeq.contains(sub_str)){
					subSeq.add(sub_str);
					System.out.println(sub_str);
				}
				
				for(int k=1;k<sub_str.length()-1;k++){
					StringBuilder sb = new StringBuilder(sub_str);
					sb.deleteCharAt(k);
					if(!subSeq.contains(sb.toString()))subSequence(sb.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Power Set of: abc \n");
		new SubSequence().subSequence("abcc");
	}
}
