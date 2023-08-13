package jumpgame;
/*
 * https://leetcode.com/problems/jump-game/discuss/219957/Java-solution-with-explanations-in-Chinese
 * https://leetcode.com/problems/jump-game/discuss/20900/Simplest-O(N)-solution-with-constant-space
 */
public class Solution {
	boolean canJump(int A[], int n) {
	    int last =n-1;
	    for(int i=n-1;i>=0;i--){
	    	if(i+A[i]>=last) last =i;
	    }
	    
	    return last<=0;
	}
	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		System.out.println(new Solution().canJump(nums, nums.length));
	}
	
}
