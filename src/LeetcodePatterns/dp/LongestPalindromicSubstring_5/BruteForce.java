package LeetcodePatterns.dp.LongestPalindromicSubstring_5;

public class BruteForce {
  
  public static void main(String[] args) {
    String s = "a";
        //"abacabacabb";    --#a#b#a#c#a#b#a#c#a#b#b#
        //                  --01234567890123456789012
        //#c#b#b#d#                 --"cbbd"
        //01234567890123456789012
    System.out.println(new BruteForce().longestPalindrome(s));
  }

  public String longestPalindrome(String s) {
    s = populateHash(s);
    int l=0, r=0;
    int minL = 0;
    int maxR = 2;
    int max = 0;
    
    for(int i=2; i<s.length(); i++) {
      l = i-1;
      r = i+1;
      int pincrement = 0;
      while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
        --l;
        ++r;
        pincrement++;
        if(l<0 || r==s.length()) {
          l++;r--;
          break;
        }
      }
      if(pincrement>max) {
        minL = l+1;
        maxR = r-1;
        max = pincrement;
      }
    }
    
    
    return s.equals("#")?"": s.substring(minL,maxR+1).replace("#", "");
  }
  
  public String populateHash(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append("#");
    for(char c : s.toCharArray()) {
      sb.append(c);
      sb.append("#");
    }
    return sb.toString();
  }
}
