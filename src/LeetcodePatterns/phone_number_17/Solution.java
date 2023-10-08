package LeetcodePatterns.phone_number_17;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import util.PrintJavaFunction;

public class Solution {
  
  public static void main(String[] args) {
    String digits = "8809199802";
    List<String> list = new Solution().letterCombinations(digits);
    
    PrintJavaFunction.printList(list);
  }
  
  public List<String> letterCombinations(String digits) {
    String[] mapping = {"+","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    if(digits.isEmpty()) return new LinkedList<String>();
    
    char[] ca = digits.toCharArray();
    Queue<String> queue = new LinkedList<String>();
    int charAt0 = Integer.parseInt(String.valueOf(digits.charAt(0)));
    String str = mapping[charAt0];
    queue.addAll(
        str.chars().mapToObj(item -> String.valueOf((char) item)).collect(Collectors.toList()));
    for(int i=1; i<digits.length(); i++) {
      int dig = Integer.parseInt(String.valueOf(ca[i]));
      
      int size = queue.size();
      
      for(int j=0; j<size; j++) {
        String s = queue.poll();
        
        String sm = mapping[dig];
        for(char ch : sm.toCharArray()) {
          queue.add(s + String.valueOf(ch));
        }
      }
    }
    
    
    return new LinkedList<>(queue);
  }
}
