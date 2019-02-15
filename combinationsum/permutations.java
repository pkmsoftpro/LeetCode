package combinationsum;

import java.util.ArrayList;
import java.util.List;

/*
 * Permutations : https://leetcode.com/problems/permutations/
 */

public class permutations {

	private static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list,new ArrayList<Integer>(), nums);
		return list;
	}

	private static void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums) {
		if(tempList.size()==nums.length){
			list.add(new ArrayList<Integer>(tempList));
		} else {
			for(int i=0;i<nums.length;i++){
				if(tempList.contains(nums[i])) continue;
				tempList.add(nums[i]);
				backtrack(list,tempList,nums);
				tempList.remove(tempList.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,3};
		System.out.println(permute(nums));
	}
}
