package InterleavingString_97;

/*
 * https://leetcode.com/problems/interleaving-string/discuss/31910/4ms-recursive_memoization-java
 */

import java.util.HashSet;
import java.util.Set;

public class recursive_memoization {
	Set<String> mem = new HashSet<String>();
	
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() == 0 && s2.length() == 0 && s3.length() == 0)
            return true;
        if(mem.contains(s1+"#"+s2)) 
            return false;
        if(s3.length() > 0){
            if(s1.length() > 0 &&  s1.charAt(0) == s3.charAt(0))
                if(isInterleave(s1.substring(1),s2,s3.substring(1))) return true;
            if(s2.length() > 0 && s2.charAt(0) == s3.charAt(0))
                if(isInterleave(s1,s2.substring(1),s3.substring(1))) return true;
        }
        mem.add(s1+"#"+s2);
        return false;
    }
	
	public static void main(String[] args) {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		System.out.println(new recursive_memoization().isInterleave(s1, s2, s3));
	}
}
