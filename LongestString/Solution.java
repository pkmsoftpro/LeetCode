package LongestString;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] dict = new int[128];
        int res = 0, l = 0, r = 1;
        for(char c : s.toCharArray()) {
            l = Math.max(l, dict[c]);
            dict[c] = r;
            res = Math.max(res, r++ - l);
        }
        return res;
    }
    
    public static void main(String[] args) {
		String str = "arwvivbgvtybtnudd";
		int n  = lengthOfLongestSubstring(str);
		System.out.println(n);
	}
}