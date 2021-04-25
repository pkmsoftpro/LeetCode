package arraysandstrings.containerwater;

public class Solution1 {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(new Solution1().maxArea(height));
    }

    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int max = Integer.MIN_VALUE;

        while(left<=right){
            int maxArea = Math.min(height[left], height[right])*(right-left);
            max = Math.max(maxArea, max);
            if(height[left]<height[right])
                left++;
            else right--;
        }
        return max;
    }
}
