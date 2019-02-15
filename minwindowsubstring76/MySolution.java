package minwindowsubstring76;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySolution {
    
	public String minWindow(String s, String t) {
		Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
		for(int i=0;i<s.length();i++){
			if(!map.containsKey(s.charAt(i))){
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(Character.valueOf(s.charAt(i)), list);
			} else {
				map.get(s.charAt(i)).add(i);
			}
		}
		return null;
    }
	//{A=[0, 10], B=[3, 9], C=[5, 12], D=[1, 7], E=[4, 8], N=[11], O=[2, 6]}
	
	public static void main(String[] args) {
		String S = "ADOBECODEBANC", T = "ABC";
		System.out.println(new MySolution().minWindow(S, T));
	}
}
