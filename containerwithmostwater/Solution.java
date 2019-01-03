package containerwithmostwater;

public class Solution {

	public static int maxArea(int[] height) {
		int max = 0;
		for(int i=0;i<height.length-1;i++){
			for(int j=i+1;j<height.length;j++){
				int xAxis = j-i;
				int y = height[i]<height[j]?height[i]:height[j];
				int total = y*xAxis;
				if(total>=max){
					max = total;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		/*int[] arr = {1,2,1};*/
		System.out.println(maxArea(arr));
	}
}
