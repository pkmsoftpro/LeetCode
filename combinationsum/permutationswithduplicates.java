package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Permutations II (contains duplicates) : https://leetcode.com/problems/permutations-ii/
 */

public class permutationswithduplicates {

	private static List<List<Integer>> permutationswithduplicates(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return list;
	}

	private static void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, boolean[] used) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<Integer>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
				used[i]=true;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, used);
				used[i]=false;
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 2 };
		System.out.println(permutationswithduplicates(nums));
	}
}
