package LongestString;
import java.util.HashSet;
import java.util.Set;

//   https://www.youtube.com/watch?v=4-LshVFzfLI
//https://www.youtube.com/watch?v=6avtxejCZYA
//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
//https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3649636/3-method-s-c-java-python-beginner-friendly/


public class EasySol {

	public static int getString(String str){
		int maxLength = 0;
		Set<Character> set = new HashSet<Character>();
		int i=0,j=0;
		while(j<str.length()){
			if(!set.contains(str.charAt(j))){
				set.add(str.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		String str = "arwvivbgvtybtnudd";
		int n  = getString(str);
		System.out.println(n);
	}
}
