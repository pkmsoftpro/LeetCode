package searchrotatedsortarrayII_81;

public class MySolution {

	public boolean search(int[] nums, int target) {
		
		int start=0, mid=0; int end = nums.length-1;
		while(start<end){
			mid = start + (end-start)/2;
			if(nums[mid]==target) return true;
			if(nums[start]==target) return true;
			
			if(nums[start]<nums[mid]){
				if(nums[mid]>target && nums[start]<target) end=mid;
				else start=mid+1;
			} else if(nums[mid]<nums[start]){
				if(nums[mid]<target) start=mid+1;
				else if(nums[mid]>target) end=mid-1;
				
				if(end>-1 && nums[end]<target) return false;
				else if(end>-1 && nums[end]>target) end--;
				else if(end>-1 && nums[end]==target) return true;
			} else start++;
		}
    
		return start==end && nums[start]==target;
    }

	public static void main(String[] args) {
		/*int[] nums = {2,5,6,0,0,1,2};*/
		int[] nums={4,5,6,7,0,1,2};
		System.out.println(new MySolution().search(nums, 0));
	}
}
