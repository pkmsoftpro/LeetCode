package combinationsum;

import java.util.ArrayList;
import java.util.List;

public class palindrome {

	private static List<List<String>> palin(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
		backtrack(list,new ArrayList<String>(),s,0);
		return list;
	}

	private static void backtrack(List<List<String>> list,
			ArrayList<String> tempList, String s, int start) {
		if(start==s.length()){
			list.add(new ArrayList<String>(tempList));
		} else {
			for(int i=start;i<s.length();i++){
				if(isPalin(s, start, i)){
					tempList.add(s.substring(start,i+1));
					backtrack(list,tempList,s,i+1);
					tempList.remove(tempList.size()-1);
				}
			}
		}
	}
	
	private static boolean isPalin(String s, int start, int end){
		while(start<end)
			if(s.charAt(start++)!=s.charAt(end--)) return false;
		return true;
	}

	public static void main(String[] args) {
		String s = "Santiagogait";
		System.out.println(palin(s));
	}
}
