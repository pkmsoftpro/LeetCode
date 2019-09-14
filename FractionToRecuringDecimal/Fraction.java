package com.test;

import java.util.HashMap;
import java.util.Map;

public class Fraction {

	public String getFraction(int numerator, int denominator){
		StringBuilder sb = new StringBuilder();
		sb.append(numerator/denominator);
		sb.append(".");
		numerator = numerator * 10;
		Map<Long, Long> map = new HashMap<Long, Long>();
		while(numerator!=0){
			if(map.containsKey((long)numerator)){
				return sb.toString();
			}
			map.put((long)numerator, (long)numerator);
			numerator = (numerator %denominator) * 10;
			sb.append(numerator/denominator);
			
			
			/*map.put((long)numerator, sb.length());
            sb.append(numerator / denominator);    
            numerator = (numerator % denominator) * 10;*/
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Fraction fraction = new Fraction();
		System.out.println(fraction.getFraction(355,113));
	}
}
