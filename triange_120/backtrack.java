/*
    public int bt(List<List<Integer>> triangle, int row, int col) {
      if (row == triangle.size()) {
          return 0;
      }
      int curr = triangle.get(row).get(col);
      int left = bt(triangle, row + 1, col);
      int right = bt(triangle, row + 1, col + 1);
      return Math.min(left, right) + curr;
  }
*/

package triange_120;

import java.util.Arrays;
import java.util.List;

import pascaltriange_118.Solution;

public class backtrack {

	int[] table;
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
            return 0;
        }
        table = new int[triangle.size()];
        Arrays.fill(table, Integer.MIN_VALUE);
        return bt(triangle, 0, 0);
    }
    
    
    public int bt(List<List<Integer>> triangle, int row, int col) {
        if (row == triangle.size()) {
            return 0;
        }
        int curr = triangle.get(row).get(col);
        int left = 0;
        if (table[row] != Integer.MIN_VALUE) {
            left = table[row];
        } else {
            left = bt(triangle, row + 1, col);
        }
        int right = bt(triangle, row + 1, col + 1);
        table[row] = right;
        return Math.min(left, right) + curr;
    }
	
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution().generate(4);
		list.get(2).set(0, 5);
		//list.get(3).set(list.get(3).size()-1, 5);
		System.out.println(new backtrack().minimumTotal(list));
	}
}
