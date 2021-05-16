package tree_separate.interleavingstring;

public class Sol {

    public boolean isInterleave(String s1, String s2, String s3) {
    System.out.println("s1: " + s1 + ", s2: " + s2 + ", s3: " + s3);
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
            return true;
        }
        if(s3.isEmpty()) return false;

        return (!s1.isEmpty() && !s3.isEmpty() && isInterleave(s1.substring(1), s2, s3.substring(1)))
                || (!s2.isEmpty() && !s3.isEmpty() && isInterleave(s1, s2.substring(1), s3.substring(1)));
    }

  public static void main(String[] args) {
    String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
    System.out.println(new Sol().isInterleave(s1,s2,s3));
  }
}
