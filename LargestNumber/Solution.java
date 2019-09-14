import java.util.Arrays;
import java.util.Comparator;


public class Solution {
	class CustomComparator implements Comparator<String>{
		@Override
		public int compare(String s1, String s2) {
			StringBuilder sb1 = new StringBuilder(s1+s2);
			StringBuilder sb2 = new StringBuilder(s2+s1);
			return sb2.toString().compareTo(sb1.toString());
		}
	}
	
	public String largestNumber(int[] nums) {
		String[] sarr = new String[nums.length];
		for(int i=0;i<nums.length;i++){
			sarr[i] = Integer.valueOf(nums[i]).toString();
		}
		Arrays.sort(sarr, new CustomComparator());
		String retVal="";
		for(int i=0;i<sarr.length;i++){
			retVal+=sarr[i];
		} Integer i = null;
		try{
			i = new Integer(retVal);
		} catch (Exception e){
			return retVal;
		}
		
		return i.toString();
	}
	
	public static void main(String[] args) {
		//int[] arr = {9,31,4,0,9};
		int[] arr = {999999998,999999997,999999999};
		Solution sol = new Solution();
		System.out.println(sol.largestNumber(arr));
	}

		
}