package phonenumbertoletter;

import java.util.ArrayList;
import java.util.List;

public class Sol {

	static char[][] dict = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'},
		{'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
	
	public static void search(String num, String s, int i, List<String> out) {
		char[] candidate = null;
		if(i==num.length()){
			out.add(s);
		}
		if(i<num.length()){
			candidate = dict[num.charAt(i)-'2'];
			for(char c : candidate)
				search(num, s+c,i+1,out);
		}
		
	}
	
	public static void main(String[] args) {
		String str = "52";
		List<String> list = new ArrayList<String>();
		search(str, "", 0, list);
		System.out.println(list);
	}
}
