package mergesort;

public class Solution {

	private static void merge(int[] arr,int start, int mid, int end) {
		// TODO Auto-generated method stub
		int l1 = mid-start+1;
		int l2 = end - mid;
		int[] L1 = new int[l1];
		int[] L2 = new int[l2];
		int lone=0,ltwo=0;
		
		for(int i=0;i<l1;i++) L1[i] = arr[i];
		for(int j=0;j<l2;j++) L2[j] = arr[l1++];
		int i=0;
		for(int j=start;j<=end;j++){
			if(lone<L1.length && (ltwo>=L2.length || L1[lone]<=L2[ltwo])){
				arr[i] = L1[lone];
				i++;
				lone++;
			} else if(ltwo<L2.length){
				arr[i] = L2[ltwo];
				i++;
				ltwo++;
			}
		}
	}
	
	public static void mergesort(int[] arr, int start, int end){
		if(start<end){
			int mid = (start+end)/2;
			mergesort(arr, start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);		
		}
	}

	public static void main(String[] args) {
		/*int[] arr = {1,3,6,2,4,5};*/
		int[] arr = {-2,4,6,1,5,10};
		int mid = (arr.length-1)/2;
		//merge(arr,0,mid,arr.length-1);
		mergesort(arr,0,arr.length-1);
		System.out.println();
	}
}
