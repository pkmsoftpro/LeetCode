package com.permutation;

import java.util.HashSet;

public class StringPermutation {
	
	HashSet<String> set = new HashSet<String>();
	
	private void permutate(String str){
		
		/*if(!set.contains(str)){
			set.add(str);
			System.out.println(str);
		}*/
		
		for(int i=0;i<str.length();i++){
			
			String permStr = null;
			for(int j=str.length();j>i;j--){
				permStr = swap(str, i,j-1);
				
				if(!set.contains(permStr)) {
					set.add(permStr);
					System.out.println(permStr);

					permutate(permStr);
				}
			}
			
			
		}
		
		return;
	} 
	
	private String swap(String str, int s1, int s2){
		char[] arr = str.toCharArray();
		char temp = arr[s1];
		arr[s1] = arr[s2];
		arr[s2] = temp;
		
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		StringPermutation sp = new StringPermutation();
		sp.permutate("abc");
	}
}
