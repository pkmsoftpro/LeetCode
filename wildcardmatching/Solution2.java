package wildcardmatching;
/*
 * //https://gist.github.com/kanrourou/7898bf9d41d1ed7be5da
 */
public class Solution2 {
    public boolean isMatch(String s, String p) {
        int plen = p.length();
        int slen = s.length();
        int iStore = 0, jStore = 0, pi = 0, sj = 0;
        boolean hasStar = false;
        if (plen == 0)
            return slen == 0;
        while (sj < slen) {
            if (pi < plen && (p.charAt(pi) == s.charAt(sj) || p.charAt(pi) == '?')) {
                pi++;
                sj++;
            } else if (pi < plen && p.charAt(pi) == '*') {
                hasStar = true;
                while (pi < plen && p.charAt(pi) == '*'){
                    pi++;
                }
                if (pi == plen)
                    return true;
                iStore = pi;
                jStore = sj;
            } else {
                if (!hasStar)
                    return false;
                pi = iStore;
                jStore++;
                sj = jStore;
            }
        }
        while (pi < plen && p.charAt(pi) == '*'){
            pi++;
        }
        return pi == plen;
    }
    
    public static void main(String[] args) {
		/*String s = "aaabbzzzt ";
		String p = "a*z?*?t?";*/
    	String s = "aazzaa";
		String p = "a*z?aa";
		System.out.println(new Solution2().isMatch(s, p));
	}
}