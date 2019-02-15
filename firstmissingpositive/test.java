package firstmissingpositive;

public class test {

	public static void main (String[] args) 
	{ 
		int arr[] = {100,1,9,2,3,5}; 
		int arr_size = arr.length; 
		int missing = findMissing(arr, arr_size); 
		System.out.println("The smallest positive missing number is "+ 
							missing); 
	}

	private static int findMissing(int[] arr, int size) {
		int i=0;
		while(i<size){
			int x = Math.abs(arr[i]);
			if(x-1<size && arr[x-1]>0){
				arr[x-1] = -arr[x-1];
			}
			i++;
		}
		
		return 0;
	} 
}
