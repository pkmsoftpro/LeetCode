package removedupsorarr2_80;

public class Solution {

	/*public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int num : nums) {
			if (i < 1 || num > nums[i - 1]) {
				nums[i++] = num;
			}
		}
		return i;
	}*/
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int num : nums) {
			if (i < 2 || num > nums[i - 2]) {
				nums[i++] = num;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		/* int[] nums = {0,0,1,1,1,1,2,3,3}; */
		/* int[] nums = {1,1,1,2,2,3}; */
		int[] nums = { 1, 2, 2 };
		System.out.println(new Solution().removeDuplicates(nums));
	}
}
