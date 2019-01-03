package commonstring;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,-5,-2,-4,-5,-1};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 0));
		
	}
}
