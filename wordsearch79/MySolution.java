package wordsearch79;

public class MySolution {

	public boolean exist(char[][] board, String word) {
		String[][] dp = new String[board.length][board[0].length];
		dp[0][0] = String.valueOf(board[0][0]);
		for(int r=0;r<board.length;r++){
        	for(int c=0;c<board[0].length;c++){
        		if(populateDP(dp, board, word, r, c))
        			return true;
        	}
		}
		return false;
	}
	
	boolean populateDP(String[][] dp, char[][] board, String word, int r, int c){
		String val1="",val2="",val3="",val4="";
		if(r-1>=0 && dp[r-1][c]!=null){
			val1 = dp[r-1][c]+String.valueOf(board[r][c]);
			if(word.contains(val1) && val1.charAt(0)==word.charAt(0)) dp[r][c] = val1;
		}
		if(c-1>=0 && dp[r][c-1]!=null){
			val2 = dp[r][c-1]+String.valueOf(board[r][c]);
			if(word.contains(val2) && val2.length()>val1.length() && val2.charAt(0)==word.charAt(0))
				dp[r][c] = val2;
		}
		if(r+1<dp.length && dp[r+1][c]!=null){
			val3 = dp[r+1][c]+String.valueOf(board[r][c]);
			if(word.contains(val3) && val3.charAt(0)==word.charAt(0) && (val3.length()>val1.length() || 
					val3.length()>val2.length()))
				dp[r][c] = val3;
		}
		if(c+1<dp[0].length && dp[r][c+1]!=null){
			val4 = dp[r][c+1]+String.valueOf(board[r][c]);
			if(word.contains(val4) && val4.charAt(0)==word.charAt(0) && (val4.length()>val1.length() || 
					val4.length()>val2.length() || val4.length()>val3.length()))
				dp[r][c] = val4;
		}
		return dp[r][c]!=null?dp[r][c].equals(word):false;
	}
	
	public static void main(String[] args) {
		char[][] board = /*{
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'}
				};*/
			{{'a','a'}};
		/*System.out.println(new Solution2().exist(board, "ABCCED"));*/
		System.out.println(new MySolution().exist(board, "aaa"));
	}
}
