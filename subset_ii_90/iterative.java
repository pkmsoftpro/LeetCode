package subset_ii_90;

/*
 * https://leetcode.com/problems/subsets-ii/discuss/30286/Recursion-and-non-recursion-Java-solution-for-your-reference
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterative {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		res.add(temp);
		Arrays.sort(nums);
		int l = 0, k;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] != nums[i - 1])
				l = res.size();
			k = res.size();
			for (int j = k - l; j < k; j++) {
				temp = new ArrayList<>(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 4, 4, 1, 4 };
		System.out.println(new iterative().subsetsWithDup(nums));
	}
}
