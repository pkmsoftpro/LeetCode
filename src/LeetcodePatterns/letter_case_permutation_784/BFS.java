package LeetcodePatterns.letter_case_permutation_784;
//https://leetcode.com/problems/letter-case-permutation/solutions/115485/java-easy-bfs-dfs-solution-with-explanation/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.Print;

public class BFS {

  public static void main(String[] args) {
    String s = "a1b2";  //a1b2 A1b2 A1B2 a1B2 
    List<String> list = new BFS().letterCasePermutation(s);
    if (list != null)
      Print.printList(list);
    else
      System.out.println("empty");
  }
  
  public List<String> letterCasePermutation(String s) {
    
    Queue<String> queue = new LinkedList<String>();
    queue.add(s);
    
    for(int k=0; k<s.length(); k++) {
      
      if(Character.isLetter(s.charAt(k))) {
        int size = queue.size();
        for(int i=0; i<size; i++) {
          char[] ca = queue.poll().toCharArray();
          ca[k] = Character.toUpperCase(ca[k]);
          queue.add(String.valueOf(ca));
          ca[k] = Character.toLowerCase(ca[k]);
          queue.add(String.valueOf(ca));
        }
      }
    }
    return new LinkedList<>(queue);
  }
}
