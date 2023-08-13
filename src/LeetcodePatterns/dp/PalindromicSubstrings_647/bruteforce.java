package LeetcodePatterns.dp.PalindromicSubstrings_647;

// https://leetcode.com/problems/palindromic-substrings/solutions/105689/java-solution-8-lines-extendpalindrome/

public class bruteforce {
  
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(new bruteforce().countSubstrings(s));
  }

  public int countSubstrings(String s) {
    return compute(s, 0, s.length());
  }
  
  public int compute(String s, int lo, int hi) {
    int count = 0;
    
    for(int i=0; i<s.length(); i++)
      count += isPalidrome(s, i, i, 0) + isPalidrome(s, i, i+1, 0);
    
    return count;
  }

  public int isPalidrome(String s, int lo, int hi, int count) {
    
    while(lo>=0 && hi<s.length() && s.charAt(lo)==s.charAt(hi)) {
      lo--;
      hi++;
      count++;
    }
    return count;
  }
}
