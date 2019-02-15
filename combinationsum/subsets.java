package combinationsum;

import java.util.ArrayList;
import java.util.List;

/*
 * This structure might apply to many other backtracking questions, 
 * but here I am just going to demonstrate Subsets, Permutations, and Combination Sum.
 * Subsets : https://leetcode.com/problems/subsets/
 */

public class subsets {

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(), nums, 0);
		return list;
	}
	
	private static void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<Integer>(tempList));
		for(int i=start;i<nums.length;i++){
			tempList.add(nums[i]);
			backtrack(list,tempList,nums,i+1);
			tempList.remove(tempList.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,3};
		System.out.println(subsets(nums));
	}
}
