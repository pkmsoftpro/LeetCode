import java.util.*;

class Solution {
  public String mostCommonWord(String paragraph, String[] bd) {
    String[] words = paragraph.split("[\\s]+|\\,");
    Map<String, Integer> map = new HashMap<>();
    List st = Arrays.asList(bd);
    int maxCount = 0;
    String maxMachedString = "";
    for (String word : words) {

      String w = word.replaceAll("[\\!\\?\\'\\,\\.\\;]", "")
              .toLowerCase().trim();
      if(w.isEmpty()) continue;
      if(st.contains(w)) continue;
      if (map.containsKey(w)){
        int currentCount = map.get(w)+1;
        if(currentCount>maxCount){
          maxCount = currentCount;
          maxMachedString = w;
        }
        map.put(w, map.get(w) + 1);
      }
      else map.put(w, 1);
    }
    List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
    Collections.sort(
            list,
            new Comparator<Object>() {
              public int compare(Object o1, Object o2) {
                return ((Comparable<Integer>) ((Map.Entry<String, Integer>) (o2)).getValue())
                        .compareTo(((Map.Entry<String, Integer>) (o1)).getValue());
              }
            });
    //return list.get(0).getKey();
    return maxMachedString;
  }
}