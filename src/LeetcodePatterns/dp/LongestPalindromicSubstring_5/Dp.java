package LeetcodePatterns.dp.LongestPalindromicSubstring_5;

// https://www.youtube.com/watch?v=WpYHNHofwjc&ab_channel=Pepcoding

public class Dp {

  public static void main(String[] args) {
    String s = "abbba";
        //#a#b#a#c#a#b#a#c#a#b#b#         --"abacabacabb";
        //01234567890123456789012
        //#c#b#b#d#                 --"cbbd"
        //01234567890123456789012
        //#a#b#c#d#b#b#f#c#b#a#     --abcdbbfcba
        //01234567890123456789012
        //#c#b#c#d#c#b#e#d#c#b#c#       --cbcdcbedcbc
        //01234567890123456789012
        //#1#2#3#4#v#a#a#v#1#q#a#h#a#q#     --1234vaav1qahaq
        //01234567890123456789012345678
    System.out.println(new Dp().longestPalindrome(s));
  }
  
  public String longestPalindrome(String s) {
    String best = "";
    boolean[][] dp = new boolean[s.length()][s.length()];
    
    for(int gap = 0; gap<s.length(); gap++) {
      for(int i=0, j = gap; j<s.length(); i++,j++) {
        if(gap==0) 
          dp[i][j] = true;
        else if(gap==1 && s.charAt(i)==s.charAt(j))
          dp[i][j] = true;
        else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
          dp[i][j] = true;
        
        String str = s.substring(i, j+1);
        if(dp[i][j] && str.length()>best.length())
          best = str;
      }
    }
    
    return best;
  }
}
