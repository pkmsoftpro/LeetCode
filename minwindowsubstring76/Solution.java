package minwindowsubstring76;
/*
 * https://leetcode.com/problems/minimum-window-substring/discuss/26808/here-is-a-10-line-template-that-can-solve-most-substring-problems/235127
 * 
 * https://www.youtube.com/watch?v=9odu9ImG9oY&t=694s
 * 
 * ** https://leetcode.com/problems/minimum-window-substring/discuss/26808/Here-is-a-10-line-template-that-can-solve-most-'substring'-problems

https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
 */

public class Solution {
	public String minWindow(String s, String t) {
		int[] map = new int[128];

		for (char c : t.toCharArray())
			map[c]++;

		int count = t.length(), begin = 0, end = 0, d = Integer.MAX_VALUE, head = 0;

		while (end < s.length()) {
			if (map[s.charAt(end)] > 0){
				count--;
			}
			map[s.charAt(end)]--;
			end++;
			while (count == 0) {
				if (end - begin < d) {
					d = end - begin;
					head = begin;
				}
				if (map[s.charAt(begin)] == 0)
					count++;
				map[s.charAt(begin)]++;
				begin++;
			}
		}

		return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);

	}
	
	public static void main(String[] args) {
		String S = "AOBECOEBANC", T = "ABC";
		System.out.println(new Solution().minWindow(S, T));
	}
}
