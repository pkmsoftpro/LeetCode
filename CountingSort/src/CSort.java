

public class CSort {
	
	private int[] sortElements(int[] arr){
		int[] temp = new int[100];
		int[] count = new int[10];
		for(int i=0;i<arr.length;i++){
			count[arr[i]]+=1;
		}
		System.out.println("done");
		int x =1;
		while(x<10){
			count[x]+=count[x-1];
			x++;
		}
		for(int i=0;i<arr.length;i++){
			temp[count[arr[i]]] = arr[i];
			count[arr[i]]-=1;
		}
		return temp;
	}

	
	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 2, 7, 5, 2};
		arr = new CSort().sortElements(arr);
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
	}
}
