package sort.heapsort;

import util.Print;

public class HeapSort {

  public static void main(String[] args) {
    int[] arr = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
    heapsort(arr);
    Print.print(arr);
  }
  
  public static void heapsort(int[] arr) {
    buildheap(arr);
    int last = arr.length-1;
    int currentHeapLength = last-1; // introducing currentHeapLength to accomodate 
                                    // A:heap-size = A:heap-size - 1
    for(int i=0; i<arr.length; i++) {
      swap(arr, 0, last--);
      heapify(arr, 0, currentHeapLength--);
    }
  }
  
  public static void buildheap(int[] arr) {
    int uptoi = arr.length/2-1;
    for(int i=uptoi; i>=0; i--) {
      heapify(arr, i, arr.length-1);
    }
  }
  
  public static void heapify(int[] arr, int i, int currnentHeapLength) {
    int lefti = lefti(i);
    int righti = righti(i);
    
    int largest = i;
    
    if(valid(arr, lefti, largest, currnentHeapLength) && arr[lefti]>arr[largest])
      largest = lefti;
    if(valid(arr, righti, largest, currnentHeapLength) && arr[largest]<arr[righti])
      largest = righti;
    if(valid(arr, i, largest, currnentHeapLength) && largest!=i) {
      swap(arr, i, largest);
      heapify(arr, largest, currnentHeapLength);
    }
  }
  
  public static int lefti(int i) {
    return 2*i+1;
  }
  
  public static int righti(int i) {
    return 2*i+2;
  }
  
  public static void swap(int[] arr, int i, int j) {
    int m = arr[i];
    arr[i] = arr[j];
    arr[j] = m;
  }
  
  public static boolean valid(int[] arr, int i, int j, int currnentHeapLength) {
    return i<=currnentHeapLength && i>=0 && j<=currnentHeapLength && j>=0;
  }

}
