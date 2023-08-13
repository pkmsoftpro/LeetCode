package LeetcodePatterns.dp.WordBreak_139;

//https://leetcode.com/problems/word-break/editorial/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Iterative {

  public static void main(String[] args) {
    List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
    String s = "catsandog";
    // "leetcode"; -"leet","code"
    // "catsandog"; - "cats","dog","sand","and","cat"
    System.out.println(new Iterative().wordBreak(s, wordDict));
  }

  public boolean wordBreak(String s, List<String> wordDict) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(0);
    
    boolean[] dp = new boolean[s.length()+1];
    
    while(!queue.isEmpty()) {
      int start = queue.poll();
      if(start==s.length()) {
        return true;
      }
      
      for(int end = start +1; end<=s.length(); end++) {
        if(dp[end]) continue;
        if(wordDict.contains(s.substring(start, end))) {
          queue.add(end);
          dp[end] = true;
        }
      } 
    }
    return false;
  }
}
