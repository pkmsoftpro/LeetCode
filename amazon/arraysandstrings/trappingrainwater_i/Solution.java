package arraysandstrings.trappingrainwater_i;

public class Solution {

  public static void main(String[] args) {
    int[] height = {4, 2, 0, 3, 2, 5};
    int[] height2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    System.out.println(new Solution().trap(height2));
  }

  public int trap(int[] height) {
    int lmax = 0;
    int rmax = height.length - 1;
    int totalWater = 0;
    int i = 1, j = height.length-2;
      int currentMaxLeft = 0;
      int currentMaxRight = 0;

    while (lmax <= rmax && i<=j) {
        currentMaxLeft  = Math.max(currentMaxLeft,height[lmax]);
        currentMaxRight = Math.max(currentMaxRight,height[rmax]);
      if (height[lmax] < height[rmax]) {
        if(currentMaxLeft>height[i])
            totalWater += currentMaxLeft-height[i];
         i++;
         lmax++;
      } else {
          if(currentMaxRight>height[j])
              totalWater += currentMaxRight-height[j];
          rmax--;
          j--;
      }
    }
    return totalWater;
  }
}
