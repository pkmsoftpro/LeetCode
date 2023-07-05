package util;

import java.util.Arrays;

public class PrintArray {
  
  private PrintArray() {}

  public static void print(int[] arr) {
    Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
  }
}
