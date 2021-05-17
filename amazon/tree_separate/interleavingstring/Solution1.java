package tree_separate.interleavingstring;

public class Solution1 {
  public boolean is_Interleave(String s1, int i, String s2, int j, String s3, int k, int[][] memo) {
    if(i==s1.length()){
      return s3.substring(k).equals(s2.substring(j));
    }
    if(j==s2.length()){
      return s1.substring(i).equals(s3.substring(k));
    }
    if(memo[i][j]>=0){
      return memo[i][j]==1;
    }
    boolean ans = false;
    if(s1.charAt(i)== s3.charAt(k) && is_Interleave(s1, i+1, s2, j, s3, k+1, memo)
        || s2.charAt(j)==s3.charAt(k) && is_Interleave(s1, i, s2, j+1, s3, k+1, memo)){
      ans = true;
    }
    memo[i][j] = ans?1:0;
    return ans;
  }

  public boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
      return false;
    }
    int memo[][] = new int[s1.length()][s2.length()];
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        memo[i][j] = -1;
      }
    }
    return is_Interleave(s1, 0, s2, 0, s3, 0, memo);
  }

  public static void main(String[] args) {
    String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbccca";
    System.out.println(new Solution1().isInterleave(s1, s2, s3));
  }
}
