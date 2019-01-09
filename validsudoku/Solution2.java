package validsudoku;

public class Solution2 {

	public final static int SIZE = 9;
	
    public static boolean isValidSudoku(char[][] board) {
        // Array[coord][value] = true if the value has already been seen
        boolean[][] rowValue = new boolean[SIZE][SIZE];
        boolean[][] colValue = new boolean[SIZE][SIZE];
        boolean[][] sqrValue = new boolean[SIZE][SIZE];
        for (int row = 0; row < SIZE; ++row) {
            int squareRow = (row < 3 ? 0 : (row < 6 ? 3 : 6));
            for (int col = 0; col < SIZE; ++col) {
                char c = board[row][col];
                if (c == '.')
                    continue;
                int sqr = squareRow + (col < 3 ? 0 : (col < 6 ? 1 : 2));
                int val = c - '1';
                if (rowValue[row][val] || colValue[col][val] || sqrValue[sqr][val])
                    return false; // Duplicate value = not valid
                rowValue[row][val] = true;
                colValue[col][val] = true;
                sqrValue[sqr][val] = true;
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
