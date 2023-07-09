package LeetcodePatterns.generalized_abbreviation_320;

// https://yuncoong.gitbooks.io/leetcode/content/320.html
// https://www.codingninjas.com/studio/problem-details/generalized-abbreviation_1233144
import java.util.ArrayList;
import java.util.List;

import util.PrintArray;

public class Solution {

  public static void main(String[] args) {
    String abb = "word";
    List<String> list = generateAbbreviations(abb);
    PrintArray.printList(list);
    System.out.println("done");
  }

  public static List<String> generateAbbreviations(String word) {
    List<String> res = new ArrayList<String>();
    helper(res, "", word, 0, 0);
    return res;
  }

  private static void helper(List<String> res, String curr, String word, int pos, int cnt) {
    if (pos == word.length()) {
      if (cnt > 0) {
        curr += cnt;
      }
      res.add(curr);
    } else {

      helper(res, curr, word, pos + 1, cnt + 1);
      helper(res, curr + (cnt > 0 ? cnt : "") + word.charAt(pos), word, pos + 1, 0);
    }
  }
}



/*
  public static List<String> generateString(String word) {

    return null;
  }

  public void generate(int number, int x, int y) {

    if (x >= 1 && x <= number) {

      generate(number, x++, y);
    }
  }
*/