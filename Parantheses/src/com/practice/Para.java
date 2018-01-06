package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Para {
	
	public List<String> getPair(int n){
		List<String> strList = new ArrayList<String>();
		char[] car = new char[2*n];
		int pos = 0;
		generatePair(pos, strList, car);
		return strList;
	}
	
	public void generatePair(int pos, List<String> arrList, char[] car){
		
		if(pos == car.length){
			if(validate(car)){
				arrList.add(new String(car));
			}
		} else {
			car[pos]='(';
			generatePair(pos+1, arrList, car);
			car[pos]=')';
			generatePair(pos+1, arrList, car);
		}
		
	}
	
	public boolean validate(char[] car){
		int balance = 0;
		for(char ch : car){
			if(ch=='(') balance++;
			else balance--;
			if(balance < 0) return false;
		}
		return balance==0;
	}
	
	public static void main(String[] args) {
		Para para = new Para();
		List<String> strList = para.getPair(3);
		System.out.println(strList);
	}
}
