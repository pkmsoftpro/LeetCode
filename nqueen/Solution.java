package nqueen;
/*
https://www.youtube.com/watch?v=wGbuCyNpxIg
https://github.com/bephrem1/backtobackswe/blob/master/Dynamic%20Programming%2C%20Recursion%2C%20%26%20Backtracking/nQueens.java
*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().solveNQueens(4));
	}


public List<List<String>> solveNQueens(int n) {
  List<List<String>> result = new ArrayList<>();
  solveNQueens(n, 0, new ArrayList<Integer>(), result);
  return result;
}

private void solveNQueens(int n, int row, List<Integer> colPlacements,
                                  List<List<String>> result){
  if (row == n) 
    result.add(generateBoardFromPlacements(colPlacements, n));

  else {
    for (int col = 0; col < n; col++) {
      colPlacements.add(col);
      if (isValid(colPlacements)) {
        solveNQueens(n, row + 1, colPlacements, result);
      }
      colPlacements.remove(colPlacements.size() - 1);
    }
  }
}

private static boolean isValid(List<Integer> colPlacements) {

  int rowWeAreValidatingOn = colPlacements.size() - 1;
  for (int ithQueenRow = 0; ithQueenRow < rowWeAreValidatingOn; ithQueenRow++) {

    /*
      Get the absolute difference between:
      1.) The column of the already placed queen we are comparing against:
        colPlacements.get(i)
      2.) The column of the queen we just placed 
        colPlacements.get(rowWeAreValidatingOn)
    */
    int absoluteColumnDistance = Math.abs(colPlacements.get(ithQueenRow) -
                                  colPlacements.get(rowWeAreValidatingOn));

    /*
      1.) If the absolute difference in columns is 0 then we placed in a column being
      attacked by the i'th queen.
        absoluteColumnDistance == 0
      2.) If the absolute difference in columns equals the distance in rows from the
      i'th queen we placed then the queen we just placed is attacked diagonally.
        absoluteColumnDistance == rowWeAreValidatingOn - i
      For Constraint #2 imagine this:
      [
        ". . Q .",  <--- row 0 (Queen 1)
        "Q . . .",  <--- row 1 (Queen 2)
        ". Q . .",  <--- row 2 (Queen 3)
        ". . . ."
      ]
      Absolute Column Distance Between Queen 2 & 3 == 1.
      Queen 2 is in col 0, Queen 3 is in col 1. 1 - 0 = 1.
      Absolute Row Distance Between Queen 2 & 3 == 1
      Queen 2 is in row 1, Queen 3 is in row 2. 2 - 1 = 1.
    */
    if (absoluteColumnDistance == 0 || absoluteColumnDistance == rowWeAreValidatingOn - ithQueenRow) {
      return false;
    }
  }

  return true;
}

/*
 [
   ".Q..",
   "...Q",
   "Q...",
   "..Q."
  ]
  Generate a board from the list of column placements for each of the n rows.
*/
private List<String> generateBoardFromPlacements(List<Integer> colPlacements, int n) {

  List<String> board = new ArrayList<>();
  int totalItemsPlaced = colPlacements.size();

  /*
    Materialize a row for each queen that we placed
  */
  for (int row = 0; row < totalItemsPlaced; row++) {

    StringBuilder sb = new StringBuilder();

    /*
      Go through all columns in the row and populate the string.
      If the column has a queen in it place a 'Q', otherwise place
      a '.'
    */
    for (int col = 0; col < n; col++) {
      if (col == colPlacements.get(row)) {
        sb.append('Q');
      } else {
        sb.append('.');
      }
    }

    /*
      Add the row to the board
    */
    board.add(sb.toString());

  }

  return board;
}
}
