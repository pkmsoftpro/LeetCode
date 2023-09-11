package majority_elements_MinIndexValidSplit_2780;

// https://leetcode.com/problems/minimum-index-of-a-valid-split/solutions/3771388/find-majority-boyer-moore-very-simple-and-easy-to-understand-saddlebackvariant/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    List<Integer> nums= new ArrayList<>(Arrays.asList(3,3,3,3,7,2,2));
    int num = new Solution().minimumIndex(nums);
    System.out.println(num);
  }
  
  public int minimumIndex(List<Integer> list) {
    
    int major=list.get(0), count=1;
    
    for(int num : list) {
      if(num == major) count++;
      else count--;
      if(count == 0) { major = num; count = 1; }
    }
    
    int majcount = 0;
    for(int num : list)   if(num==major)  majcount++;
    
    count=0;
    
    for(int i=0; i<list.size(); i++) {
      if(list.get(i)==major) count++;
      
      if(count*2>i+1 && (majcount-count)*2>list.size()-i-1)
        return i;
    }
    return -1;
  }
}

