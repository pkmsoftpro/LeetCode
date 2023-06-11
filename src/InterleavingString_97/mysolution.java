package InterleavingString_97;

public class mysolution {

  public static void main(String[] args) {
    String s1 = "aabccababababab", s2 = "dbbcatttttttttt", s3 = "aadbbcbcacabababababtttttttttt";
    System.out.println(new mysolution().isInterleave(s1, s2, s3));
}

  private boolean isInterleave(String s1, String s2, String s3) {
    if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
      return true;
    } else if(s3.isEmpty()) {
      return false;
    }
    return ((s1.length()>0) && s1.charAt(0)==s3.charAt(0) && isInterleave(s1.substring(1), s2, s3.substring(1))
        || ((s2.length()>0) && s2.charAt(0)==s3.charAt(0) && isInterleave(s1, s2.substring(1), s3.substring(1)))
        );
  }
}
