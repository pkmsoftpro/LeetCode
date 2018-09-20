class Solution {
    
	
	public int getTarget(int[] arr, int target, int start, int end){
		if(end>=arr.length) end = arr.length-1;
		if(start == end && target==arr[start]){
			return start;
		}
		if(start<0 || target<arr[start] || target>arr[end]){
			return -1;
		}
		int mid = start + (end-start)/2;
		if(target == arr[mid]){
			return mid;
		}
		else if(target>arr[mid]){
			return getTarget(arr, target, mid+1, end);
		} else {
			return getTarget(arr, target, start, mid-1);
		}
	}
	
	public int[] twoSum(int[] numbers, int target) {
        int[] two = new int[2];
        int index2 = 0;
		for(int i=0; i<numbers.length; i++){
			int first = numbers[i];
			int second = target-first;
			index2 = getTarget(numbers, second, i+1, numbers.length);
			if(index2 != -1) {
				two[0] = i+1;
				two[1] = index2+1;
				return two;
			}
		}
		return two;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {5,25,75};
		int[] two = sol.twoSum(arr, 100);
		System.out.println(two[0] + " " +two[1]);
	}
}