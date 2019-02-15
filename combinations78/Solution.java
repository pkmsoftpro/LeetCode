package combinations78;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> combine(int n, int k) {
		int[] nums = new int[n];
		for(int i=0;i<n;i++) nums[i]=i+1;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(), nums, 0, k);
		return list;
	}

	private void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, int start, int k) {
		if(tempList.size()==k){
			list.add(new ArrayList<Integer>(tempList));
		}

		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1, k);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Solution().combine(4,2));
	}
}
