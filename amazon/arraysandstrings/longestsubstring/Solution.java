package arraysandstrings.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int x=0, y=0, max = 0;
        Set<Character> set = new HashSet<>();
        while(y<s.length())
            if(!set.contains(s.charAt(y))){
                set.add(s.charAt(y));
                max = Math.max(max, y-x+1);
                y++;
            } else
                set.remove(s.charAt(x++));
        return max;
    }

  public static void main(String[] args) {
    String s = "pwwkew";

    System.out.println(new Solution().lengthOfLongestSubstring(s));
  }
}
