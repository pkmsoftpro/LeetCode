package minimumwindowsubstring;

import java.util.*;

public class Solution {
  public String minWindow(String s, String t) {
    if(t.equals(s)) return s;
    if(t.length()==1)
      if(s.contains(t)) return t;
      else return "";
    Set<Character> set = new HashSet<>();
    char[] sa = t.toCharArray();
    for(char c : sa){
      set.add(c);
    }
    int first = -1, last =-1;
    for(int i=0; i<s.length(); i++){
      if(set.contains(s.charAt(i))){
        if(first == -1) first = i;
        else if(last==-1 && set.size()==1) {
          last=i;
          break;
        }
        set.remove(s.charAt(i));
      }
    }
    int maxLen = Integer.MAX_VALUE;
    if(last==-1) return "";
    int maxlen = last-first+1;
    String retVal = s.substring(first, last+1);
    String word = retVal;
    for(char c : sa){
      set.add(c);
    }
    int j=0;
    for(int i=last+1; i<s.length(); i++){
      while((word.contains(""+s.charAt(i)) && set.contains(s.charAt(i)))
        || !set.contains(word.charAt(0))){
        word = word.substring(1);
      }
      word = word+s.charAt(i);
      if(validate(word, set)){
        if(retVal.length()>word.length()) retVal = word;
      }
    }
    System.out.println("window: " + s.substring(first, last+1));
    return retVal;
  }

  public boolean validate(String word, Set<Character> set){
    for(char c : set){
      if(!word.contains(""+c)) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "aa";
    String t = "aa";
    System.out.println(new Solution().minWindow(s, t));
  }
}
