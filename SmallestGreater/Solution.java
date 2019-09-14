package com.project;

public class Solution {
//101,101,101,107,113,113,113,118,118,121
//'e','e','e','k','q','q','q','v','v','y'
	public char smallestElement(char[] letters,char target){
		int len = letters.length;
		int high = letters[len-1];
		int low = letters[0];
		int t = target;
		int mid = -1;
		if(t>=high){
			return letters[0];
		}
		while(t<high && len>0){
			len--;
			mid = (high+low)/2;
			if(t==mid){
				break;
			}
			if(t<mid) high=mid;
			else low = mid;
		}
		if(t>=low && t<=high){
			
			for(int x : letters){
				if(x>mid){
					return (char)x;
				}
			}
		}
		return (char)high;
	}
	public static void main(String[] args) {
		char [] a = {'e','e','e','k','q','q','q','v','v','y'};/* 101,101,101,107,113,113,113,118,118,121*/
		for(int x:a){
			System.out.print(x+",");
		}
		Solution sol = new Solution();
		System.out.println((char)sol.smallestElement(a, 'j'));
		
	}
}
