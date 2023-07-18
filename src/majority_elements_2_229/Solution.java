package majority_elements_2_229;

import java.util.ArrayList;
import java.util.List;

import util.Print;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {2,2,1,3};
    List<Integer> list = new Solution().majorityElement(nums);
    Print.printList(list);
  }
  
  
  public List<Integer> majorityElement(int[] nums) {
    
    List<Integer> list  = new ArrayList<>();
    int major1 = nums[0], count1 = 0;
    int major2 = 0, count2 = 0;
    
    for(int i=0; i<nums.length; i++) {
      
      if(major1==nums[i]) {
        count1++;
      } else if(major2==nums[i]) {
        count2++;
      } else if(count1==0) {
        major1 = nums[i];
        count1++;
      } else if(count2==0) {
        major2 = nums[i];
        count2++;
      } else {
        count1--;
        count2--;
      }
    }
    count1 = count2 = 0;
    for(int i=0; i<nums.length; i++) {
      if(major1==nums[i])
        count1++;
      if(major2==nums[i])
        count2++;
    }
    if(count1>nums.length/3)
      list.add(major1);
    if(count2>nums.length/3 && major1!=major2)
      list.add(major2);
    
    return list;
  }
}
