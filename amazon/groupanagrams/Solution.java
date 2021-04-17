package groupanagrams;

import java.util.*;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String str : strs){
      char[] c = str.toCharArray();
      Arrays.sort(c);
      String key = new String(c);
      if(map.containsKey(key)){
        map.get(key).add(str);
      } else map.put(key, new ArrayList<>(){{add(str);}});
    }
    return new ArrayList(map.values());
  }

  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[] strs1 = {"c", "c"};
    System.out.println(new Solution().groupAnagrams(strs1));
  }
}
