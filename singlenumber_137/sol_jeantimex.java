package singlenumber_137;

/*
 * https://leetcode.com/problems/single-number/discuss/43222/Java-solution-using-XOR
 */

public class sol_jeantimex {

	public int singleNumber(int[] nums) {
		int ans = 0;

		for (int i = 0; i < nums.length; i++)
			ans ^= nums[i];

		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(new sol_jeantimex().singleNumber(nums));
	}
}
