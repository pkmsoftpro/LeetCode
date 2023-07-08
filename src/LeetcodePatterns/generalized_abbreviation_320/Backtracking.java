package LeetcodePatterns.generalized_abbreviation_320;

import java.util.ArrayList;
import java.util.List;

import util.PrintArray;

public class Backtracking {

  public static void main(String[] args) {
    String abb = "word";
    List<String> list = generateAbbreviations(abb);
    PrintArray.printList(list);
    System.out.println("done");
  }

  public static List<String> generateAbbreviations(String word) {
    List<String> ans = new ArrayList<String>();
    backtrack(ans, new StringBuilder(), word, 0, 0);
    return ans;
  }

  private static void backtrack(List<String> ans, StringBuilder builder, String word, int i, int k) {
    int len = builder.length();
    if (i == word.length()) {
      if (k != 0)
        builder.append(k);
      ans.add(builder.toString());
    } else {
      backtrack(ans, builder, word, i + 1, k + 1);

      if (k != 0)
        builder.append(k);
      builder.append(word.charAt(i));
      backtrack(ans, builder, word, i + 1, 0);
    }

    builder.setLength(len); // reset builder to the original state
  }
}
