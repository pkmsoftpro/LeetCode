package phonenumbertoletter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol2 {

	static char[][] dict = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'},
		{'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
	
	public static List search(String digit) {
	
		Queue<String> q = new LinkedList<String>();
		
		for(char c : dict[digit.charAt(0)-'2']){
			q.add(""+c);
		}
		
		for(int step=1;step<digit.length();step++){
			int size = q.size();
			while(size-->0){
				String firstchar = q.poll();
				for(char c : dict[digit.charAt(step)-'2']){
					q.add(firstchar+c);
				}
			}
		}
		return (List) q;
				
	}
	
	public static void main(String[] args) {
		String str = "523";		
		System.out.println(search(str));
	}
}
