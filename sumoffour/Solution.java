package sumoffour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//[-4,-3,-2,-1,0,0,1,2,3,4]
//0,3,6,9

class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> res = new HashSet<>();
        List<Atom> map = new ArrayList<Atom>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Integer> list = new HashSet<>();
                list.add(i);
                list.add(j);
                Atom atom = new Atom(nums[i]+nums[j], list);
                map.add(atom);
            }
        }
        int mapSize = map.size();
        for(int i=0;i<mapSize-1;i++){
            for(int j=i+1;j<mapSize;j++){
                //int num=target-(nums[i]+nums[j]);
                Atom one = map.get(i);
                Atom two = map.get(j);
                if(one.sum+two.sum==target && !one.list.contains(j) && two.list.contains(i)){
                	List<Integer> list = new ArrayList<>();
                	for(int k : one.list)
                        list.add(nums[k]);
                	for(int k : two.list)
                        list.add(nums[k]);
                	Collections.sort(list);
                	result.add(list);
                }
            }
        }
        /*List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> lst : res)
            result.add(lst);*/
        return result;
    }
    
    //[-7[0, 1], -6[0, 2], -5[0, 3], -4[0, 4], 
    //-4[0, 5], -3[0, 6], -2[0, 7], -1[0, 8], 0[0, 9], -5[1, 2], 
    //-4[1, 3], -3[1, 4], -3[1, 5], -2[1, 6], -1[1, 7], 0[1, 8], 1[1, 9],
    //-3[2, 3], -2[2, 4], -2[2, 5], -1[2, 6], 0[2, 7], 1[2, 8], 2[2, 9], 
    //-1[3, 4], -1[3, 5], 0[3, 6], 1[3, 7], 2[3, 8], 3[3, 9], 0[4, 5], 
    //1[4, 6], 2[4, 7], 3[4, 8], 4[4, 9], 1[5, 6], 2[5, 7], 3[5, 8], 4[5, 9],
    //3[6, 7], 4[6, 8], 5[6, 9], 5[7, 8], 6[7, 9], 7[8, 9]]
    
    public static void main(String[] args) {
		int[] arr = {-4,-3,-2,-1,0,0,1,2,3,4};
		System.out.println(fourSum(arr, 0));
	}
}