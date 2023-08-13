package LeetcodePatterns.dp.WordBreak_139;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recursive {

  public static void main(String[] args) {
    List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
    String s = "catsanddog";
    // "leetcode"; -"leet","code"
    // "catsandog"; - "cats","dog","sand","and","cat"
    System.out.println(new Recursive().wordBreak(s, wordDict));
  }

  public boolean wordBreak(String s, List<String> wordDict) {
    return compute(s, wordDict, new HashSet<String>()); // incorporated set, cache to avoid Iterative
  }

  public boolean compute(String s, List<String> wordDict, Set<String> set) {
    
    if(s.length()==0)
      return true;
    if(set.contains(s))
      return false;
    
    for (int i = 0; i <= s.length(); i++)
      if (wordDict.contains(s.substring(0, i)) && compute(s.substring(i), wordDict, set))
        return true;
    set.add(s);
    
    return false;
  }
}
