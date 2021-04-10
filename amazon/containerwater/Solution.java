package containerwater;

public class Solution {
  int maxArea = Integer.MIN_VALUE;
  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(new Solution().maxArea(height));
  }

    public int maxArea(int[] height) {
      quickProcess(0, height.length-1, height);
      return maxArea;
    }

    public void quickProcess(int low, int high, int[] height){
      if(high>low){
      System.out.println("low: " + low + ", high: " + high);
        int mid = low + (high-low)/2;
        int leftheight = process(low, mid, height);
        int rightheight = process(mid+1, high, height);
        int allheight = Math.min(height[high],height[low]) * (high-low);
        maxArea = Math.max(maxArea, Math.max(leftheight, Math.max(rightheight, allheight)));
        quickProcess(low, mid, height);
        quickProcess(mid+1, high, height);
      }
    }

    public int process(int low, int high, int[] height){
      int area = 0;
      if(high>low){
        area = Math.min(height[high],height[low]) * (high-low);
      }
      return area;
    }
}
