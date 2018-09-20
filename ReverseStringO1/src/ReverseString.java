import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class ReverseString {

	public static String reverseWords(String s) {
		String[] sentence = null;
		StringBuilder retVal = new StringBuilder("");
        if (s!=null){
        	if(s.length()>0){
        		StringTokenizer tokens = new StringTokenizer(s," ");
        		sentence = new String[tokens.countTokens()];
        		int i = 0;
        		while(tokens.hasMoreElements()){
        			sentence[i]=tokens.nextToken();
        			i++;
        		}
        		List<String> strList = Arrays.asList(sentence);
        		Collections.reverse(strList);
        		for(String str : strList){
        			retVal.append(str).append(" ");
        		}return retVal.toString().trim();
        	} else return s;
        }
		return null;
    }
	public static void main(String[] args) {
		System.out.println(reverseWords("abc def ghi"));
	}
}
