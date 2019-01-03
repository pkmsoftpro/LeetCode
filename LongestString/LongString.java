package LongestString;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LongString {
	/*static String longString = "";*/
	
	public static String getString(String s){
		List<String> list = new ArrayList<String>();
		list.add("");
		String k = getLongString(s);
		list.clear();list.add(k);
		while(s.length()>0){
			s = s.substring(1);
			k = getLongString(s);
			if(list.get(0).length()<k.length()){
				list.clear();
				list.add(k);
			}
		}
		return list.get(0);
	}
	
	public static String getLongString(String str){
		String temp = "", longString ="";
		int i = 0;
		Set<Character> set = new HashSet<Character>();
		for(int t=0;t<longString.length();t++){
			set.add(longString.charAt(t));
		}
		for(i=0; i<str.length(); i++){
			if(set.contains(str.charAt(i))){
				/*while(str!=null && i!=str.length()){
					longString = longString.length() > (temp = getLongString(
							str.substring(i+1))).length() ? longString : temp;
				}*/
				return longString;
			} else {
			longString = longString + str.charAt(i);
			set.add(str.charAt(i));
			}
		}
		return str;
	}

	
	public static void main(String[] args) {
		String str = "arwvivbgvtybtnudd";
		str  = getString(str);
		System.out.println(str);
	}
}
