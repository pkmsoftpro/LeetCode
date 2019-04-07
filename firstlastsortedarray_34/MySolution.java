package firstlastsortedarray;

public class Solution {

	public static int[] searchRange(int[] nums, int target) {
		if(nums.length==0) return new int[]{-1,-1};
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
		int rightfirst=left+1;
		while(rightfirst<right-1){
			int mid = rightfirst + (right-rightfirst)/2;
			if(nums[mid]==target){
				rightfirst = mid;
			} else if(nums[mid]>target){
				right = mid;
			} else {
				right = rightfirst;
			}
		}
		if(nums[right]==target) last=right;
		else if(nums[rightfirst]==target) last = rightfirst;
		else return new int[] {left,left};
		return new int[]{left,last};
	}

	public static void main(String[] args) {
		int[] nums = { 1,2,3,3,3,3,4,5,9 /*1,3*/ /*5,7,7,8,8,10*/ /*8,8,8,8,8,8*/ };
		int target = 3;
		nums = searchRange(nums, target);
		System.out.println(nums[0]+" "+nums[1]);
	}
}
