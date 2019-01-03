package longestpalindrom;

class Solution {
	static String resStr = "";
    static int max = 0;
    static int len = 0;
    static int low = 0;
    
    private static int helper(String s, int mid) {
        int left = mid-1;
        int right = mid;
        
        // find next mid
        while (right<len-1 && s.charAt(right) == s.charAt(right+1)) {
        	right++;
        }
        mid = right++;
        
        // check the longest palindrom from mid
        while (left>=0 && right<len && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        // calculate current longest substring
        if (right-left-1 > max) {
            max = right-left-1;
            low = left+1;
        }
        
        return mid;
    }
    
    public static String longestPalindrome(String s) {
        if (s==null || s.length()==0) return resStr;
        
        len = s.length();
        
        for (int mid=0; mid<len; mid++) {
            mid = helper(s, mid);
        }
        
        return s.substring(low, low+max);
    }
	
	public static void main(String[] args) {
		String str = /*"aya";*/"aouyqyuoaua";
		System.out.println("string: " + str);
		System.out.println("palin: " + longestPalindrome(str));
	}
}
