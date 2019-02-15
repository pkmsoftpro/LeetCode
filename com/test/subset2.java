package com.test;

import java.util.ArrayList;
import java.util.List;

public class subset2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtrack(list, new ArrayList<Integer>(), nums, new boolean[nums.length],0);
        return list;
    }
    
    private void backtrack(List<List<Integer>> list,
			ArrayList<Integer> tempList, int[] nums, boolean[] used, int start) {
		list.add(new ArrayList<Integer>(tempList));
		for(int i=start;i<nums.length;i++){
			if(used[i]==true || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
			tempList.add(nums[i]);
			used[i]=true;
			backtrack(list,tempList,nums,used,i+1);
			used[i]= false;
			tempList.remove(tempList.size()-1);
		}
		
	}

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.println(new subset2().subsetsWithDup(nums));
	}
}
