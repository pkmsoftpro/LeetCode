package util;

import java.util.Arrays;
import java.util.List;

public class PrintArray {
  
  private PrintArray() {}

  public static void print(int[] arr) {
    Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
  }
  
  @SuppressWarnings("unchecked")
  public static void printList(List list) {
    list.stream().forEach(i -> System.out.print(i + " "));
  }
}
