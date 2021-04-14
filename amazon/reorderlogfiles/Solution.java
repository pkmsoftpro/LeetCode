package reorderlogfiles;

import java.util.*;

class Pair implements Comparable<String>{

  String key, value;

  public Pair(String key, String value){
    this.key = key;
    this.value = value;
  }

  @Override
  public int compareTo(String o) {
    return this.key.compareTo(o);
  }
}

public class Solution {
  public String[] reorderLogFiles(String[] logs) {
    List<Pair> pairs = new ArrayList<Pair>();
    String[] output = new String[logs.length];
    List<String> list = new ArrayList<String>();

    for(String log : logs){
      String s = log.substring(log.indexOf(" ")+1);
      if (s.matches(".*\\d.*")) list.add(log);
      else {
        pairs.add(new Pair(s, log.substring(0, log.indexOf(s)-1)));
      }
    }
    int i=0;
    pairs.sort(new Comparator<Pair>() {
      @Override
      public int compare(Pair o1, Pair o2) {
        if(o1.key.equals(o2.key)){
          return o1.value.compareTo(o2.value);
        }
        return o1.key.compareTo(o2.key);
      }
    });
    for(Pair p : pairs){
      output[i++] = p.value + " " + p.key;
    }
    for(String s : list){
      output[i++] = s;
    }
    return output;
  }

  public static void main(String[] args) {
    String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
    String[] output = new Solution().reorderLogFiles(logs);
    for(String s : output){
      System.out.println(s);
    }
  }
}
