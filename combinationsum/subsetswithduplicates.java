package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Subsets II (contains duplicates) : https://leetcode.com/problems/subsets-ii/
 */

public class subsetswithduplicates {

	public static List<List<Integer>> subsetswithduplicates(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, 0);
		return list;
	}
	
	private static void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<Integer>(tempList));
		for(int i=start;i<nums.length;i++){
			if(i>start && nums[i]==nums[i-1]) continue;
			tempList.add(nums[i]);
			backtrack(list,tempList,nums,i+1);
			tempList.remove(tempList.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,3,2};
		System.out.println(subsetswithduplicates(nums));
	}
}
