package arraysandstrings.groupanagrams;

import java.util.*;

class Trie {
  Trie[] trie;
  boolean eow = false;
  public Trie(){
    trie = new Trie[26];
  }
}

public class SolTrie {
  public static void main(String[] args) {
    String[] strs2 = {"c","c"};
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[] strs1 = {"bdddddddddd", "bbbbbbbbbbc"};
    System.out.println(new SolTrie().groupAnagrams(strs));
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    return getTrie(strs, map);
  }

  public List<List<String>> getTrie(String[] strs, Map<String, List<String>> map){
    Trie m = new Trie();
    Trie t;
    for(String str : strs){
      t = m;
      char[] s = str.toCharArray();
      Arrays.sort(s);
      for(int i=0; i<s.length; i++){
        int c = s[i]-'a';
        if(t.trie[c]==null){
          t.trie[c] = new Trie();
          t = t.trie[c];
          if(i==s.length-1) {
            t.eow = true;
            String key = new String(s);
            if(map.get(key)!=null)
              map.get(key).add(str);
            else  map.put(key, new ArrayList<>(){{add(str);}});
          }
        } else {
          t = t.trie[c];
          String key = new String(s);
          if(map.get(key)!=null)
            map.get(key).add(str);
          else  map.put(key, new ArrayList<>(){{add(str);}});
          break;
        }
      }
      if(str.isEmpty()){
        if(map.get("")==null)
          map.put("", new ArrayList<>(){{add("");}});
        else map.get("").add("");
      }
    }
    return new ArrayList(map.values());
  }
}
