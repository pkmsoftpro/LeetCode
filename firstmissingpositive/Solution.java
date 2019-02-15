package firstmissingpositive;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static int firstMissingPositive(int[] nums) {
		int t=0; List<Integer> numList = new ArrayList<Integer>();
		while(t<nums.length){
			numList.add(nums[t]);
			t++;
		}
		int ret = 0;
		int i=0; int m=1;
		while(i<=nums.length){
			if(!numList.contains(m)) return m;
			i++;
			m++;
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,0};
		System.out.println(firstMissingPositive(nums));
	}
}
