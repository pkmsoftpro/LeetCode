package validsudoku;

public class test {

	public static boolean isValidSudoku(char[][] board) {

		boolean[][] rowCount = new boolean[9][9];
		boolean[][] colCount = new boolean[9][9];
		boolean[][] sqrCount = new boolean[9][9];

		for(int i=0;i<9;i++){
			int sqrRow = i<3?0:(i<6?3:6);
			for(int j=0;j<9;j++){
				if(board[i][j]=='.') continue;
				int c = board[i][j]-'1';
				int sqrCol = sqrRow + (j<3?0:(j<6?1:2));
				if(rowCount[i][c] || colCount[j][c] || sqrCount[sqrCol][c])
					return false;
				rowCount[i][c] = true;
				colCount[j][c] = true;
				sqrCount[sqrCol][c] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = {
				 {'.','.','4', '.','.','.', '6','3','.'},
				 {'.','.','.', '.','.','.', '.','.','.'},
				 {'5','.','.', '.','.','.', '.','9','.'},
				 
				 {'.','.','.', '5','6','.', '.','.','.'},
				 {'4','.','3', '.','.','.', '.','.','1'},
				 {'.','.','.', '7','.','.', '.','.','.'},
				 
				 {'.','.','.', '5','.','.', '.','.','.'},
				 {'.','.','.', '.','.','.', '.','.','.'},
				 {'.','.','.', '.','.','.', '.','.','.'}
		};
		
		System.out.println(isValidSudoku(board));
	}
}
