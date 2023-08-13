package LeetcodePatterns.dp.WordBreak_139;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
  boolean isWord;
  Map<Character, TrieNode> children;
  TrieNode() {
      this.children = new HashMap<>();
  }
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    String t = "";
    
    Map<Character, TrieNode> map = children;
    
    while(map!=null) {
      t = t+map.keySet().toString();
      
      try {
        map = map.get(map.keySet().toArray()[0]).children;
        if(map.get(map.keySet().toArray()[0]).isWord)
          t += "*";
      } catch (Exception e) {
        return t;
      }
      
    }
    
    return t;
  }
}

public class Trie {
  
  public static void main(String[] args) {
    List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
    String s = "catsandog";
    // "aaaaaaaa"; -"aaaa","aaa"
    // "leetcode"; -"leet","code"
    // "catsandog"; - "cats","dog","sand","and","cat"
    System.out.println(new Trie().wordBreak(s, wordDict));
  }
  
  public boolean wordBreak(String s, List<String> wordDict) {
      String wor = "";
      TrieNode root = new TrieNode();
      for (String word: wordDict) {
          TrieNode curr = root;
          for (char c: word.toCharArray()) {
              if (!curr.children.containsKey(c)) {
                  curr.children.put(c, new TrieNode());
              }

              curr = curr.children.get(c);
          }
          
          curr.isWord = true;
      }
      
      boolean[] dp = new boolean[s.length()];
      for (int i = 0; i < s.length(); i++) {
          if (i == 0 || dp[i - 1]) {
              TrieNode curr = root;
              wor = "";
              for (int j = i; j < s.length(); j++) {
                  char c = s.charAt(j);
                  wor += String.valueOf(c);
                  if (!curr.children.containsKey(c)) {
                      // No words exist
                      break;
                  }
                  
                  curr = curr.children.get(c);
                  if (curr.isWord) {
                      dp[j] = true;
                  }
              }
          }
      }
      
      return dp[s.length() - 1];
  }
}






















