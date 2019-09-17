/*
 * https://leetcode.com/problems/maximum-product-subarray/discuss/183483/In-Python-it-can-be-more-concise-PythonC%2B%2BJava
 *
 * Calculate prefix product in A.
 * Calculate suffix product in A.
 * Return the max.
 */

class Solution {
    public int maxProduct(int[] nums) {
       int n = nums.length, l=0,r=0,res=nums[0];
		for(int i=0;i<n;i++) {
			l =(l==0?1:l)*nums[i];
			r =(r==0?1:r)*nums[n-1-i];
			res = Math.max(res, Math.max(l, r));
		}
		return res;
    }
}
