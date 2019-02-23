package subset_ii_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class backtrack {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums,new boolean[nums.length], 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, boolean[] used, int start) {
		list.add(new ArrayList<>(tempList));
		for(int i=start;i<nums.length;i++){
			if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
			tempList.add(nums[i]);
			used[i]=true;
			backtrack(list,tempList,nums,used, i+1);
			used[i]=false;
			tempList.remove(tempList.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 4, 4, 4, 1, 4 };
		System.out.println(new backtrack().subsetsWithDup(nums));
	}
}
