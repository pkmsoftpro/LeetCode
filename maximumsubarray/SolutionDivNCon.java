package maximumsubarray;

/*
 * https://www.youtube.com/watch?v=9wUr2o39CDU
 * 
 * https://leetcode.com/problems/maximum-subarray/discuss/20357/Divide-and-Conquer-Java-solution.
 * 
 * https://leetcode.com/problems/maximum-subarray/discuss/184467/Java-divide-and-conquer.../224577
 */
public class Solution {

	public int maxCrossingSubarray(int[] a, int start, int mid, int end){
		int left = Integer.MIN_VALUE;
		int sum =0;
		for(int i=mid;i>=start;i--){
			sum += a[i];
			if(sum>left) left = sum;
		}
		int right = Integer.MIN_VALUE;
		sum =0;
		for(int i=mid+1;i<=end;i++){
			sum += a[i];
			if(sum>right) right = sum;
		}
		return left+right;
	}
	
	public int maxSubArray(int[] nums, int start, int end) {
		if(start>=end){
			return nums[start];
		}
		int mid = start + (end-start)/2;
		int left = maxSubArray(nums, start, mid);
		int right= maxSubArray(nums,mid+1,end);
		int maxcros = maxCrossingSubarray (nums,start,mid,end);
		
		return Math.max(maxcros, Math.max(right, left));
    }
	
	public static void main(String[] args) {
		int[] arr = {16,3,-1,8,-10,1,8,-5,10,-14,15};
		int sum = new Solution().maxSubArray(arr, 0, arr.length-1);
		System.out.println(sum);
	}
}
