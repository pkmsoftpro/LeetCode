package validsudoku;

import java.util.HashSet;

class Solution {
	public static boolean isValidSudoku(char[][] board) {
		// check rows and column
		for (int i = 0; i < 9; i++) {
			if (isValid(board, i, i, 0, 8) == false
					|| isValid(board, 0, 8, i, i) == false) {
				return false;
			}
		}

		// check blocks
		for (int i = 0; i <= 6; i = i + 3) {
			for (int j = 0; j <= 6; j = j + 3) {
				if (isValid(board, i, i + 2, j, j + 2) == false) {
					return false;
				}
			}
		}
		return true;
	}

	// Check if a given dimension of 2d matrix is a valid
	public static boolean isValid(char[][] matrix, int firstRow, int lastRow,
			int firstCol, int lastCol) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = firstRow; i <= lastRow; i++) {
			for (int j = firstCol; j <= lastCol; j++) {
				if (matrix[i][j] == '.') {
					continue;
				}
				if (matrix[i][j] < '1' || matrix[i][j] > '9') {
					return false;
				}
				if (set.contains(matrix[i][j]) == false) {
					set.add(matrix[i][j]);
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		char[][] board = {
				  {'8','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}
				};
		System.out.println(isValidSudoku(board));
	}
}
