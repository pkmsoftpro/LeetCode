package firstlastsortedarray;

public class Solution {

	public static int[] searchRange(int[] nums, int target) {

		int first=0;
		int last=nums.length-1;
		
		while(first<last-1){
			int mid=first + (last-first)/2;
			if(nums[mid]>=target){
				last = mid;
			} else {
				first = mid;
			}
		}
		int left =0, right = nums.length-1;
		if(nums[first]==target) left = first;
		else if(nums[last]==target) left = last;
		else return new int[]{-1,-1};
		while(left<right-1){
			int mid = left + (right-left)/2;
			if(nums[mid]>=target){
				right = mid;
			} else {
				left = mid;
			}
		}
		if(nums[left]==target) last=left;
		else if(nums[right]==target) last = right;
		else return new int[] {last,last};
		return new int[]{left,right};
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		nums = searchRange(nums, target);
		System.out.println(nums[0]+" "+nums[1]);
	}
}
