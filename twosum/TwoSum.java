package twosum;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	static public int[] getIndex(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++){
			int complement = target - nums[i];
			if(map.containsKey(complement)){
				return new int[] {i, map.get(complement)};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,2,9};
		int target = 15;
		arr = getIndex(arr, target);
		System.out.println(arr[1] + " " + arr[0]);
	}
}
