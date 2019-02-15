package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comsumnoreuse {

	private static List<List<Integer>> comsumnoreuse(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<Integer>(),nums,target,0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, int remains, int start) {
		if(remains<0) return;
		else if(remains==0) list.add(new ArrayList<Integer>(tempList));
		else {
			for(int i=start;i<nums.length;i++){
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remains-nums[i],i+1);
				tempList.remove(tempList.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,3,4};
		int target = 7;
		System.out.println(comsumnoreuse(nums,target));
	}
}
