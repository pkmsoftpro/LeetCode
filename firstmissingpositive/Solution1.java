package firstmissingpositive;

class Solution1 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n < 1) return 1;
        int i =0;
        while(i < n){
         //   System.out.println(nums[i]);
            if( nums[i] != i+1 && nums[i] >0 && nums[i] <= n && ( nums[nums[i] - 1] != nums[i])){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            else
                i++;
        }
        i =0;
        
        while( i < n ){
            if(i+1 != nums[i])  return i+1;
            i++;
        }
    return i+1;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,0};
		System.out.println(firstMissingPositive(nums));
	}
}