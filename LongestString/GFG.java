package LongestString;
//Java program to find the length of the longest substring 
//without repeating characters 

//https://www.youtube.com/watch?v=6avtxejCZYA
//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

public class GFG 
{ 
	
	static final int NO_OF_CHARS = 256; 
	
	static int longestUniqueSubsttr(String str) 
	{ 
		String lastIndex = new String(); // for debugging
		int n = str.length(); 
		int cur_len = 1;
		int max_len = 1;
		int i; 
		int last[] = new int[NO_OF_CHARS]; 
		for (i = 0; i < NO_OF_CHARS; i++) { 
			last[i] = -1; 
		} 
		last[str.charAt(0)] = 0; 
		for(i = 1; i < n; i++) 
		{ 
			lastIndex = (str.charAt(i) + " " + last[str.charAt(i)]); // for debugging
			boolean notVisited=last[str.charAt(i)] == -1;
			boolean secondCheck = i - cur_len > last[str.charAt(i)];
			if(notVisited || secondCheck) 
				cur_len++; 
			else
			{ 
				if(cur_len > max_len) 
					max_len = cur_len; 
				
				cur_len = i - last[str.charAt(i)]; 
			} 
			
			last[str.charAt(i)] = i; 
			lastIndex = (str.charAt(i) + " " + last[str.charAt(i)]); // for debugging
		} 
		if(cur_len > max_len) 
			max_len = cur_len; 
		
		return max_len; 
	} 
	
	public static void main(String[] args) 
	{ 
		String str = "ababc"; 
		//System.out.println("The input string is "+str); 
		int len = longestUniqueSubsttr(str); 
		System.out.println("The length of "
				+ "the longest non repeating character is "+len); 
	} 
} 
