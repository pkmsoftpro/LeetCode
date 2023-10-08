package LeetcodePatterns.binary_search.Search2DMatrixII_240;

public class solution {

  public static void main(String[] args) {
    int[][] matrix = {{1,4,7,11,15},
                      {2,5,8,12,19},
                      {3,6,9,16,22},
                      {10,13,14,17,24},
                      {18,21,23,26,30}};
    int target = 5;
    System.out.println(new solution().searchMatrix(matrix, target));
  }
  
  public boolean searchMatrix(int[][] matrix, int target) {
    int i = matrix.length, j = matrix[0].length;
    if(i==0 || j==0) return false;
    
    for(int row=0,col=j-1; row<i && col>=0; ) {
      if(target==matrix[row][col]) return true;
      
      if(target>matrix[row][col])
        row++;
      else col--;
    }
    return false;
  }
}
