package twosum;
import java.util.HashMap;
import java.util.Map;


public class BinarySearch {

	static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) return mid; 
            if (arr[mid] > x)  return binarySearch(arr, l, mid - 1, x); 
            
            return binarySearch(arr, mid + 1, r, x); 
        }
        return -9999; 
    } 
	
	static int[] sort(int[] a){
		
		for(int i=1;i<a.length;i++){
			int j= i-1,t=a[i];
			while(j>=0 && a[j]>t){
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = t;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,3,3,4,-1};
		//nums = sort(nums); //[-3, -1, 0, 3, 4]
		int target = 6;
		nums = twoSum(nums, target);
		for(int i=0;i<nums.length; i++){
			int index = binarySearch(nums, 0, nums.length-1, target-nums[i]);
			if(index != -9999){
				System.out.println(i + "  " + index);
				return;
			}
		}
		System.out.println("done");
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
