package com.reverse;

public class Solution {

	public boolean isPalindrome(int x) {
        // if(x==Integer.MIN_VALUE) return false;
        if(x<0) return false; //isPalindrome(-x);
        if(x<10) return true;
        
        int tens = 1;
        int tmp = x;
        while(tmp/10 > 0){
            tens *= 10;
            tmp = tmp/10;
        }
    
        while(tens >= 10){
            if(x/tens != x % 100) return false;
            x = x % tens / 10;
            tens /= 100;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(12321));
		System.out.println(Math.pow(58,6));
	}
}
