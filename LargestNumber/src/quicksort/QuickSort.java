package quicksort;

public class QuickSort {

	private void quickSort(int[] arr, int lo, int hi) {
		if(lo<hi){
			int q = partition(arr, lo, hi);
			quickSort(arr, lo, q-1);
			quickSort(arr, q+1, hi);
		}
	}
	
	public int partition(int[] arr, int lo, int hi){
		int pivotValue = arr[hi];
		int i = lo-1;
		for(int m=lo; m<=hi-1; m++){
			if(arr[m]<pivotValue){
				i+=1;
				swap(arr, i, m);
			}
		} 
		swap (arr,i+1,hi);
		return i+1;
	}
	
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,5,8,9,7};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}
}
