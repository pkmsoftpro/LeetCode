package sort.mergesort;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {5, 4, 1, 8, 9, 6, 5, 2, 1, 7};
    // 1,1,2,4,5,5,6,7,8,9
    new MergeSort().sort(arr);
    Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
  }

  public void sort(int[] arr) {

    merge(arr, 0, arr.length - 1);
  }

  public void merge(int[] arr, int start, int en) {

    if (start < en) {
      int mid = (start + en) / 2;

      merge(arr, start, mid);
      merge(arr, mid + 1, en);
      mergeSort(arr, start, mid, en);
    }
  }

  public void mergeSort(int[] arr, int start, int mid, int en) {

    int l = mid - start + 1;
    int r = en - mid;
    int[] L = new int[l];
    int[] R = new int[r];

    for (int i = 0; i < l; i++)
      L[i] = arr[start + i];
    for (int j = 0; j < r; j++)
      R[j] = arr[mid + 1 + j];

    int i = 0, j = 0;

    while (i < l && j < r) {
      if (L[i] <= R[j]) {
        arr[start++] = L[i];
        i++;
      } else {
        arr[start++] = R[j];
        j++;
      }
    }

    while (i < l)
      arr[start++] = L[i++];
    while (j < r)
      arr[start++] = R[j++];
  }
}
