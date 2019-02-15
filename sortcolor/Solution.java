package sortcolor;

/*
 * https://leetcode.com/problems/sort-colors/discuss/230678/Java-code-1-pass-beats-100-with-explanation
 */

class Solution {
    public void sortColors(int[] nums) {
        int start =  0, mid = 0, end = nums.length - 1; //Take 3 pointers, 1 bigin 1 end 1 mid
        //Start will always be after all 0s (pointing to a 1)
        //mid after all 1s and end before all 2s
        //after complete of loop when mid and end meets that means 0s 1s and 2s are sorted
        while (mid <= end) {
            if(nums[mid] == 0) { //This means zero is in wrong place, move it in front and increment both mid and start.
                swap(nums, start, mid);
                mid++;
                start++;
            }
            //It is in right place, just increment mid pointer
            else if(nums[mid] == 1) {
                mid++;
            }
            //2s found in wrong place, shift at end and decrement the end pointer.
            else {
                swap(nums, end, mid);
                end--;
            }
        }
        
    }
    
    private void swap(int []nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,0,2,1,1,0};
		new Solution().sortColors(nums);
		System.out.println("done");
	}
}
