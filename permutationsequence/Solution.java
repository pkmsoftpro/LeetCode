package permutationsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public String getPermutation(int n, int k) {
        int[] narr = new int[n];
        for(int i=0;i<n;i++){
        	narr[i]=i+1;
        }
        List<List<Integer>> list = new Solution().permutate(narr);
        String s = list.get(k-1).toString().replace("[", "").replace("]", "").replace(", ", "");
		return s;
    }
	
	public List<List<Integer>> permutate(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(),nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums) {
		if(tempList.size()==nums.length){
			list.add(new ArrayList<Integer>(tempList));
		} else {
			for(int i=0;i<nums.length;i++){
				if(tempList.contains(nums[i]))continue;
				tempList.add(nums[i]);
				backtrack(list,tempList,nums);
				tempList.remove(tempList.size()-1);
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println(new Solution().getPermutation(3, 3));
	}
}
