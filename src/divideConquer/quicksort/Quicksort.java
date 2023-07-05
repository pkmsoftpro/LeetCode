package divideConquer.quicksort;


public class Quicksort {
  
  public static void main(String[] args) {
    int[] arr = {3,4,8,4,5,6,1,2,3,9,6,5,7,0,4,3,1};
    int k = 10;
    int i = new Quicksort().quicksort(arr, k);
    System.out.println(i);
  }
  
  public int quicksort(int[] arr, int k) {
    int first = 0;
    int last = arr.length-1;
    
    int pivot = partition(arr, first, last);
    
    return 0;
  }

  private int partition(int[] arr, int first, int last) {
    int pivot = Integer.MIN_VALUE;
    while(first<last) {
      while(arr[first++]<arr[last]);
      if(first<last) {
        pivot = first-1;
        exchange(arr, first-1, last);
      }
    }
    
    return pivot;
  }
  
  public void exchange(int[] arr, int i, int j) {
    if(i>j) return;
    int m = arr[i];
    arr[i] = arr[j];
    arr[j] = m;
    
  }

}
