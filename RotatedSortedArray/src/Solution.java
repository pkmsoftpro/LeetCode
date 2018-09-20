
public class Solution {

	public static int searchMin(int[] a, int start, int end){
		if(a.length==1){
			return a[0];
		}
		if(a.length==2){
			if(a[0]>a[1]){
				return a[1];
			} else return a[0];
		}
		if(start==end){
			return a[start];
		}
		int midLength = (start+end)/2 - 1;
		if(a[midLength]>a[end-1]){
			return searchMin(a,midLength+1,end-1);
		} else return searchMin(a,start,midLength);
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,2};
		System.out.println(searchMin(a, 1, a.length));
	}
}
