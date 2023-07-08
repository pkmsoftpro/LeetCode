package LeetcodePatterns.generalized_abbreviation_320;

import java.util.ArrayList;
import java.util.List;

import util.PrintArray;

public class DfsPlusBacktracking {
  
  public static void main(String[] args) {
    String abb = "word";
    List<String> list = generateAbbreviations(abb);
    PrintArray.printList(list);
    System.out.println("done");
  }
  
  public static List<String> generateAbbreviations(String word) {
    List<String> result = new ArrayList<>();

    result.add(word);
    generateHelper(0, word, result);

    return result;
  }

  private static void generateHelper(int start, String s, List<String> result) {
    if (start >= s.length()) {
      return;
    }

    for (int i = start; i < s.length(); i++) {
      for (int j = 1; i + j <= s.length(); j++) {
        String num = Integer.toString(j);
        String abbr = s.substring(0, i) + num + s.substring(i + j);
        result.add(abbr);
        generateHelper(i + 1 + num.length(), abbr, result); // skip 1b
      }
    }
  }
}
