package lastwordlength;

import java.util.StringTokenizer;

public class Solution {
    public int lengthOfLastWord(String s) {
    	if(s.isEmpty() || s.trim().length()==0) return 0;
    	if(s.trim().length()!=s.length() && s.charAt(0)!=' ') return 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        String lastWord = null;
        while(st.hasMoreElements()){
        	lastWord = st.nextToken();
        }
    	return lastWord.length();
    }
    public static void main(String[] args) {
    	System.out.println(new Solution().lengthOfLastWord(" "));
	}
}
