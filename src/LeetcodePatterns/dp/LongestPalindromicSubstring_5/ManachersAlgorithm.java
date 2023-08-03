package LeetcodePatterns.dp.LongestPalindromicSubstring_5;

// https://hackernoon.com/manachers-algorithm-explained-longest-palindromic-substring-22cb27a5e96f

public class ManachersAlgorithm {
  
  public static void main(String[] args) {
    String s = "1234vaav1qahaq";
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
    System.out.println(new ManachersAlgorithm().longestPalindrome(s));
  }

  public String longestPalindrome(String s) {
    s = populateHash(s);
    int l = 0, r = 0, c = 0, max = 0, pincrement = 0, imirror = 0, minL = 0, maxR = 2;
    int[] p = new int[s.length() + 1];

    for (int i = 0; i < s.length(); i++) {

      imirror = Math.max(0, 2 * c - i); // p[i’] calculation, mirror of i with center c
      p[i] = Math.max(0, Math.min(maxR - i - 1, p[imirror])); // ignore the negative value
      
      // expand at i
      l = i - (1 + p[i]);
      r = i + (1 + p[i]);

      pincrement = p[i];
      while (l >= 0 && l < s.length() && r < s.length() && s.charAt(l) == s.charAt(r)) {
        --l;
        ++r;
        pincrement++;
        if (l < 0 || r == s.length()) {
          l++;
          r--;
          break;
        }
      }
      if (pincrement > max) {
        c = i;    // center
        minL = l; // left boundary exclusive
        maxR = r; // right boundary exclusive
        max = pincrement;
      }
      p[i] = pincrement;
    }


    return s.equals("#") ? "" : s.substring(minL + 1, maxR).replace("#", "");
  }

  public String populateHash(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append("#");
    for (char c : s.toCharArray()) {
      sb.append(c);
      sb.append("#");
    }
    return sb.toString();
  }
}
