package LeetcodePatterns.palindrome_partitioning_131;

import java.util.LinkedList;
import java.util.List;

import util.Print;

public class Solution {

  public static void main(String[] args) {
    String s = "aab";
    List<List<String>> lists = new Solution().partition(s);
    
    for (@SuppressWarnings("rawtypes") List intList : lists) {
      System.out.print("[");
      Print.printList(intList);
      System.out.print("],");
    }
  }
  
  public List<List<String>> partition(String s) {
    List<List<String>> lists = new LinkedList<List<String>>();
    compute(lists, new LinkedList<String>(), s, 0);
    return lists;
  }
  
  public void compute(List<List<String>> lists, List<String> list, String s, int start) {
    if(s.length()==start) {
      lists.add(new LinkedList<>(list));
    }
    else {
      for(int i=start; i<s.length(); i++) {
        if(isPalindrome(s, start, i)) {
          list.add(s.substring(start, i+1));
          compute(lists, list, s, i+1);
          list.remove(list.size()-1);
        }
      }
    }
  }
  
  public boolean isPalindrome(String s, int low, int high) {
    while(low<high)
      if (s.charAt(low++) != s.charAt(high--))
        return false;
    return true;
  }
}
