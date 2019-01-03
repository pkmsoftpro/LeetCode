package phonenumbertoletter;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	
	static char[][] dict = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
			{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
		
	
	/* DFS recursive */
	public static void search(List<String> list, String str, int i, String digits, char[][] dict) {
		if (i == digits.length()) {
			list.add(str);
			return;
		}
		char[] candidates = dict[digits.charAt(i) - '2'];
		for (char c : candidates)
			search(list, str + c, i + 1, digits, dict);
	}
	
	public static void main(String[] args) {
		String s = "823262";
		List<String> list = new ArrayList<String>();
		search(list, "", 0, s, dict);
		System.out.println(list);
	}
}
