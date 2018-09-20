package com.longestincreasingsubseqDP;

//https://www.hackerrank.com/challenges/longest-increasing-subsequent/problem
//https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
import java.util.ArrayList;

public class LIS {
	
	static ArrayList<ArrayList<Integer>> Lis = null;
	
	private void getLis(int[] arr){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]);
		Lis.get(0).addAll(al);
		boolean ifConditionExecuted = false;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				ifConditionExecuted=false;
				if(arr[i]>arr[j] && (Lis.get(i).size()<Lis.get(j).size()+1)){
					Lis.get(i).clear();
					Lis.get(i).addAll(Lis.get(j));
					ifConditionExecuted=true;
				}
				al.clear();
				al.add(arr[i]);
				if(ifConditionExecuted)Lis.get(i).addAll(al);
			}
		}
	}
	
	private static void initLis(int length){
		for(int i=0;i<length;i++){
			Lis.add(new ArrayList<Integer>());
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		Integer[] abc = new Integer[1];
		Lis = new ArrayList<ArrayList<Integer>>();
		initLis(arr.length);
		LIS lis = new LIS();
		lis.getLis(arr);
		System.out.println("done");
		
	}
} 
