package util;

import java.util.Arrays;
import java.util.List;

public class PrintJavaFunction {
  
  private PrintJavaFunction() {}

  public static void printArray(int[] arr) {
    System.out.print("[");
    Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    System.out.print("]");
  }
  
  @SuppressWarnings("unchecked")
  public static void printList(List list) {
    list.stream().forEach(i -> System.out.print(i + " "));
  }
  
  /*
   * following can be used for sorting twice while preserving the first sort details
   * 
   */
  public void compareArray(int[][] intervals) {
    Arrays.sort(intervals, (a,b)->{
      if(a[1]-a[0]> b[1]-b[0]) {
        return 1;
      } else if(a[1]-a[0]< b[1]-b[0]) {
        return -1;
      } else {
        return Integer.compare(a[0], b[0]);
      }
    });
  }
}
