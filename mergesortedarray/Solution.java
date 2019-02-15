package mergesortedarray;

public class Solution {

	public static void merge(int A[], int m, int B[], int n) {
		while(n>0){
			A[m+n-1]=(m==0||B[n-1]>A[m-1])?B[--n]:A[--m];
		}
	}
	public static void printArray(int[] a) {
		for(int i: a) System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] A = {4,5,6,0,0,0};
		int m = 3;
		int[] B = {1,2,3};
		int n = 3;
		printArray(A);
		printArray(B);
		merge(A,m,B,n);
		printArray(A);
	}
}
