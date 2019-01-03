package removeduplicates;

class Solution {
    public int removeDuplicates(int[] nums) {
        int space = 0;
        for(int i=0; i<nums.length; i++) {
        	nums[i-space] = nums[i];
        	if(i<nums.length-1 && nums[i] == nums[i+1]) {
        		space ++;
        	} 
        }
        return nums.length - space;
    }
}
