package phonenumbertoletter;

import java.util.ArrayList;
import java.util.List;

public class Sol3 {

	static char[][] dict = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'},
		{'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
	
	public static List<String> search(String digits) {
		List<String> list = new ArrayList<String>();
		int[] stack = new int[digits.length()];
		int step = 0;
		char[] result = new char[digits.length()];
		// the limit number of choices in step 0
		int limit0 = dict[digits.charAt(0) - '2'].length;
		while (stack[0] < limit0) {
			if (stack[step] == dict[digits.charAt(step) - '2'].length) {
				// if No.step has reach its limit, then backtrack
				stack[step] = 0;
				// trace back to last step, and prepare to search the next
				// choice
				stack[--step]++;
				continue;
			}
			if (step == digits.length() - 1) {
				// this search branch is end
				for (int i = 0; i <= step; i++) {
					result[i] = dict[digits.charAt(i) - '2'][stack[i]];
				}
				list.add(new String(result));
				stack[step]++;
			} else {
				step++;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		String str = "52";		
		System.out.println(search(str));
	}
}
