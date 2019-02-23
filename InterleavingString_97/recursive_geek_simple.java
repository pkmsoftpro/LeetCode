package InterleavingString_97;

/*
 * https://www.geeksforgeeks.org/find-if-a-string-is-interleaved-of-two-other-strings-dp-33/
 */
public class recursive_geek_simple {

	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
        	return true;
        }
        if(s3.isEmpty()) return false;
        
        return (s1.length()>0 && s1.charAt(0)==s3.charAt(0) && isInterleave(s1.substring(1), s2, s3.substring(1))) ||
        		(s2.length()>0 && s2.charAt(0)==s3.charAt(0) && isInterleave(s1, s2.substring(1), s3.substring(1)));
    }

	public static void main(String[] args) {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		System.out.println(new recursive_geek_simple().isInterleave(s1, s2, s3));
	}
}
