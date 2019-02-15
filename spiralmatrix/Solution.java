package spiralmatrix;

import java.util.ArrayList;
import java.util.List;
/*
 * https://leetcode.com/problems/spiral-matrix/discuss/221554/Java-solution
 * https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 */
public class Solution {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        if (matrix.length == 0) return list;
        int minRow = 0, minCol = 0, maxRow = matrix.length - 1, maxCol = matrix[0].length - 1;
        while (minRow <= maxRow && minCol <= maxCol) {
            for (int i = minCol; i <= maxCol; i++) {
                list.add(matrix[minRow][i]);
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                list.add(matrix[i][maxCol]);
            }
            if (minRow < maxRow && minCol < maxCol) {
                for (int i = maxCol - 1; i > minCol; i--) {
                    list.add(matrix[maxRow][i]);
                }
                for (int j = maxRow; j > minRow; j--) {
                    list.add(matrix[j][minCol]);
                }
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;   
        }
        return list;
    }
}
