package LeetcodePatterns.letter_case_permutation_784;

import java.util.ArrayList;
import java.util.List;

import util.Print;

public class Solution {

  public static void main(String[] args) {
    String s = "a1b2";  //a1b2 A1b2 A1B2 a1B2 
    List<String> list = new Solution().letterCasePermutation(s);
    if (list != null)
      Print.printList(list);
    else
      System.out.println("empty");
  }

  public List<String> letterCasePermutation(String s) {
    List<String> list = new ArrayList<String>();
    list.add(s);
    compute(s, list, s.length(), 0);
    return list;
  }

  public void compute(String s, List<String> list, int length, int num) {
    while (num < s.length()) {
      if (!list.contains(s) && s.length() == length)
        list.add(s);
      String left = s.substring(0, num);
      String right = s.substring(num + 1, s.length());
      if (Character.isLetter(s.charAt(num))) {
        if(!left.isEmpty()) 
          compute(left, list, length, num);
        if(!right.isEmpty()) 
          compute(right, list, length, num);
        String newWord = left + invert(s.charAt(num)) + right;
        if (newWord.length()==length && !list.contains(newWord)) {
          list.add(newWord);
          compute(newWord, list, length, num);
        }
      }
      num++;
    }
  }

  public String invert(char ch) {
    if (ch >= 'a' && ch <= 'z')
      return String.valueOf(ch).toUpperCase();
    else
      return String.valueOf(ch).toLowerCase();
  }
}
