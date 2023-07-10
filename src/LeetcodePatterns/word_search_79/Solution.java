package LeetcodePatterns.word_search_79;

// In the next revisit, try to keep visited outside any loop.
public class Solution {

  int[] dirs = {0, 1, 0, -1, 0};
  boolean result = false;

  public static void main(String[] args) {
    char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
    // {{'C','A','A'},{'A','A','A'},{'B','C','D'}} -- "AAB"
    // {{'A', 'B'}}; -- "BA";
    // {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}; --"ABCCED";
    String word = "AAB";
    boolean exist = new Solution().exist(board, word);
    System.out.println(exist);
  }

  public boolean exist(char[][] board, String word) {

    boolean[][] visited;

    for (int i = 0; i < board.length; i++)
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == word.charAt(0)) {
          visited = new boolean[board.length][board[0].length];
          visited[i][j] = true;
          result = false;
          wordExists(board, i, j, word, visited, 1);
          if (result)
            return true;
        }
      }

    return false;
  }

  private void wordExists(char[][] board, int m, int n, String word, boolean[][] visited,
      int wordPointer) {

    if (wordPointer == word.length())
      result = true;

    for (int i = 0; i < 4; i++) {
      int x = m + dirs[i];
      int y = n + dirs[i + 1];

      if (isValid(board, x, y) && !visited[x][y] && wordPointer < word.length()
          && board[x][y] == word.charAt(wordPointer)) {
        visited[x][y] = true;
        wordExists(board, x, y, word, visited, ++wordPointer);
        visited[x][y] = false;
        --wordPointer;
      }
    }
  }

  private boolean isValid(char[][] board, int x, int y) {
    return x >= 0 && y >= 0 && x < board.length && y < board[0].length;
  }
}
