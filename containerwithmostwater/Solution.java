package containerwithmostwater;

/*
 * https://leetcode.com/problems/container-with-most-water/discuss/6099/Yet-another-way-to-see-what-happens-in-the-O(n)-algorithm
 */

class Solution {
    public int maxArea(int[] h) {
        int area = 0, i = 0, j = h.length - 1;
        
        while (i < j) {
            int width = j - i;
            int height = h[i] <= h[j] ? h[i++] : h[j--];
            int currArea = width * height;
            
            if (currArea > area)
                area = currArea; 
        }
        
        return area;
    }
    
    public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,7};
		System.out.println(new Solution().maxArea(heights));
	}
}

/*
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
		/*int[] arr = {1,2,1};
		System.out.println(maxArea(arr));
	}
}
*/
