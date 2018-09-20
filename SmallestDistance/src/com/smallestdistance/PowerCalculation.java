package com.smallestdistance;

public class PowerCalculation {
	
	public double myPow(double x, int n) {
		/*if(n==0) return x;
		if(n<0){ n = -n; x=1/x;}
		double retval = x;
        while(n-1>0){
        	retval = retval * x;
        	n--;
        }
        return retval;*/
boolean isNegPow = false;
        
        if (n < 0) {
            x = 1 / x;
            isNegPow = true;
            n = -(n + 1); // Avoid overflow when pow == MIN_VALUE
        }
        
        double ans = 1, tmp = x;
        
        while (n != 0) {
            if (n % 2 == 1) {
                ans *= tmp;
            } 
            tmp *= tmp;
            n /= 2;
        }
        
        if (isNegPow) {
            ans *= x;
        }
        return ans;
    }
	public static void main(String[] args) {
		/*PowerCalculation pc = new PowerCalculation();
		System.out.println(pc.myPow(0.00001,2147483647));
		System.out.println(pc.myPow(5,4));*/
		System.out.println(3%3);
	}
}
