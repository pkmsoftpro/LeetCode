package LeetcodePatterns.heap_greedy.TaskScheduler_621;

// https://leetcode.com/problems/task-scheduler/solutions/104500/java-o-n-time-o-1-space-1-pass-no-sorting-solution-with-detailed-explanation/

public class solution {
  
  public static void main(String[] args) {
    char[] tasks = {'A','A','H','A','A','A','B','C','D','E','F','G','G','G','G','G','Z'};
    System.out.println(new solution().leastInterval(tasks, 2));
  }
  
  public int leastInterval(char[] tasks, int n) {
    int[] car = new int[26];
    
    for(int i=0; i<tasks.length; i++) {
      car[tasks[i]-'A']++;
    }
    
    int max = 0;
    int maxCount = 0;
    
    for(int i=0; i<26; i++) {
      if(car[i]>=max) {
        if(car[i]>max) {
          maxCount = 0;
        }
        max=car[i];
        maxCount++;
      }
    }
    
    int partCount = n-maxCount+1;
    if(partCount <=0) {
      return tasks.length;
    }
    int remaining = tasks.length-max*maxCount;
    int emptySpaces = (max-1)*partCount - remaining;
    
    if(emptySpaces<=0) {
      return tasks.length;
    }
    return tasks.length+emptySpaces;
  }
}