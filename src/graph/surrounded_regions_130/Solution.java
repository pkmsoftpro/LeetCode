package graph.surrounded_regions_130;

public class Solution {
  public void solve(char[][] board) {
    
    replaceOwithDash(board);
    for(int i=0; i<board.length; i++) 
      for(int j=0; j<board[i].length; j++) {
        if(i==0 || j==0 || i==board.length-1 || j==board[i].length-1) {
          replaceDashwithHash(board, i, j);
        }
      }
    
    System.out.println("done");
  }
  
  public void replaceOwithDash(char[][] board) {
    for(int i=0; i<board.length; i++) 
      for(int j=0; j<board[i].length; j++) 
        if(board[i][j]=='O') 
          board[i][j] = '-';
    
  }
  
  public void replaceDashwithHash(char[][] board, int i, int j) {
    if(i<0 || j<0 || i>=board.length || j>=board[i].length || board[i][j]!='-') return;

    board[i][j] = '#';
    replaceDashwithHash(board, i+1, j);
    replaceDashwithHash(board, i-1, j);
    replaceDashwithHash(board, i, j+1);
    replaceDashwithHash(board, i, j-1);
  }
  
  public static void main(String[] args) {
    char[][] board = 
    {{'X', 'O', 'X','O', 'X', 'X'},
     {'X', 'O', 'X','X', 'O', 'X'},
     {'X', 'X', 'X','O', 'X', 'X'},
     {'O', 'O', 'X','X', 'O', 'X'},
     {'X', 'X', 'X','O', 'X', 'O'},
     {'O', 'O', 'X','O', 'O', 'O'}};
    
    new Solution().solve(board);
    
    for(char[] ch : board) {
      for(char c : ch) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
