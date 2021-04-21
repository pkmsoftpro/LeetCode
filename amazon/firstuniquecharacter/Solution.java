package firstuniquecharacter;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int firstUniqChar(String s) {
        List<Character> orig = new LinkedList<>();
        List<Character> dup = new LinkedList<>();

        for(char c : s.toCharArray()){
            if(!orig.contains(c) && !dup.contains(c))
                orig.add(c);
            else if(orig.contains(c)){
                orig.remove(Character.valueOf(c));
                dup.add(c);
            }
        }
        return orig.size()>0?s.indexOf(orig.get(0)):-1;
    }

  public static void main(String[] args) {
        String s = "loveleetcode", s1 = "aabb";
    System.out.println(new Solution().firstUniqChar(s1));
  }
}
