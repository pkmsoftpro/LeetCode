package LeetcodePatterns.dp.DecodeWays_91;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TLE_BFS {

  public static void main(String[] args) {
    String s = "111111111111111111111111111111111111111";//102334155
    System.out.println(new TLE_BFS().numDecodings(s));
  }

  public int numDecodings(String s) {
    if(s==null || s.isEmpty() || s.charAt(0)=='0') return 0;
    Queue<Integer> q = new LinkedList<Integer>();
    int stringCounter = 0;
    q.add(Integer.parseInt("" + s.charAt(0)));
    stringCounter++;
    int[] mem = new int[s.length()+1];
    Arrays.fill(mem, -1);
    
    while(stringCounter<s.length()) {
      int size = q.size();
      
      for(int i=0; i<size; i++) {
        int qNum = q.poll();
        int sNum = s.charAt(stringCounter)-'0';
        if(sNum!=0) q.add(sNum);
        if(qNum*10+sNum < 27) q.add(qNum*10+sNum);
      }
      stringCounter++;
    }
    return q.size();
  }
}
