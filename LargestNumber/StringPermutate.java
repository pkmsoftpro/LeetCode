import java.util.HashSet;
import java.util.Set;


public class StringPermutate {

	static Set<String> list = new HashSet<String>();
	
	
	public Set<String> stringPermutate(String str){
		StringBuilder sb = null;
		for(int i=0;i<str.length();i++){
			for(int j=str.length()-1;j>i;j--){
				char t = str.charAt(i);
				sb = new StringBuilder(str);
				sb.setCharAt(i, str.charAt(j));
				sb.setCharAt(j, t);
				str = sb.toString();
				if(!list.contains(str.toString())){
					list.add(str.toString());
					stringPermutate(str.toString());
				}
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		StringPermutate sp = new StringPermutate();
		sp.stringPermutate("abcd");
		for(String str : list){
			System.out.println(str);
		}
	}
}
