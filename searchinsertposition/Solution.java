package searchinsertposition;

public class Solution {

	public static int searchInsert(int[] nums, int target) {

		int start = 0;
		int end = nums.length-1;
        int last = nums.length-1;
        
        if(target<=nums[0]) return 0;
		if(target==nums[last]) return last;
        if(target>nums[last]) return last+1;
		
		while(start<=end){
			int mid = start + (end-start)/2;
			if(nums[mid]==target) return mid; 
			if(nums[mid]>=target){
				end = mid;
			} else {
				start = mid;
			}
			if(nums[start]<target && nums[end]>target && end == start+1){
				return end;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = {5,5,5,5};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}
}
