package wordBreak_139;
/*
 * https://leetcode.com/problems/word-break/discuss/43790/Java-implementation-using-DP-in-two-ways
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dp {
	public boolean wordBreak(String s, Set<String> dict) {
		boolean[] t = new boolean[s.length() + 1];

		t[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (String str : dict) {
				if (str.length() <= i) {
					if (t[i - str.length()]) {
						if (s.substring(i - str.length(), i).equals(str)) {
							t[i] = true;
							break;
						}
					}
				}
			}
		}
		/*Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }*/
		return t[s.length()];
	}
    
    public static void main(String[] args) {
		String s = "applepenapple";
		List<String> dict = new ArrayList<String>(Arrays.asList(new String[]{"apple","pen"}));
		System.out.println(new dp().wordBreak(s, new HashSet<>(dict)));
	}
}
