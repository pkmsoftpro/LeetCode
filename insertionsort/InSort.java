package insertionsort;
import java.util.HashMap;
import java.util.Map;


public class InSort {
	
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public int[] sort(int[] a){
		
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
		int[] arr = {12,2,1,5,9,8,7};
		arr = new InSort().sort(arr);
		System.out.println("done");
	}
}
