package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i + 2 < nums.length; i++) {
			int j = i + 1, k = nums.length - 1;
			int target = -nums[i];
			while (j < k) {
				if (nums[j] + nums[k] == target) {
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (nums[j] + nums[k] > target) {
					k--;
				} else {
					j++;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(new Solution().threeSum(nums));
	}
}
