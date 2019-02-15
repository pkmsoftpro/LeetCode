package removedupsorarr2_80;

public class MySolution {

    public int removeDuplicates(int[] nums) {
    	
    	if(nums.length<3) return nums.length;
        int count =0;
        for(int i=1;i<nums.length;i++){
        	if(count==0){
        		if(nums[i-1]==nums[i]){
        			if(i-1==0)nums[i-1]=2;
        			else nums[i-1]=nums[i-2]+1;
        			count=1;
        		} else {
            		count = 1;
            		nums[i-1]=nums[i-2]+1;
        		}
        	} else if(nums[i]==nums[i-1]){
        		nums[i-1] = nums[i-2];
        	} else {
        		count =0;
        		nums[i-1] = nums[i-2]+1;
        	}
        }
    	return nums[nums.length-2]+count;
    }
	
	public static void main(String[] args) {
		/*int[] nums = {0,0,1,1,1,1,2,3,3};*/
		/*int[] nums = {1,1,1,2,2,3};*/
		int[] nums = {1,2,2};
		System.out.println(new MySolution().removeDuplicates(nums));
	}
}
