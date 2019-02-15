package minwindowsubstring76;

//Java program to find smallest window containing 
//all characters of a pattern. 

class GFG 
{ 
	static final int no_of_chars = 256; 
	
	// Function to find smallest window containing 
	// all characters of 'pat' 
	static String findSubString(String str, String pat) 
	{ 
		int len1 = str.length(); 
		int len2 = pat.length(); 
	
		// check if string's length is less than pattern's 
		// length. If yes then no such window can exist 
		if (len1 < len2) 
		{ 
			System.out.println("No such window exists"); 
			return ""; 
		} 
	
		int pattern[] = new int[no_of_chars]; 
		int string[] = new int[no_of_chars]; 
	
		// store occurrence of characters of pattern 
		for (int i = 0; i < len2; i++) 
			pattern[pat.charAt(i)]++; 
	
		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
	
		// start traversing the string 
		int count = 0; // count of characters 
		for (int j = 0; j < len1 ; j++) 
		{ 
			// count occurrence of characters of string 
			string[str.charAt(j)]++; 
	
			// If string's char matches with pattern's char 
			// then increment count 
			if (pattern[str.charAt(j)] != 0 && 
				string[str.charAt(j)] <= pattern[str.charAt(j)] ) 
				count++; 
	
			// if all the characters are matched 
			if (count == len2) 
			{ 
				// Try to minimize the window i.e., check if 
				// any character is occurring more no. of times 
				// than its occurrence in pattern, if yes 
				// then remove it from starting and also remove 
				// the useless characters. 
				while ( string[str.charAt(start)] > pattern[str.charAt(start)] 
					|| pattern[str.charAt(start)] == 0) 
				{ 
	
					if (string[str.charAt(start)] > pattern[str.charAt(start)]) 
						string[str.charAt(start)]--; 
					start++; 
				} 
	
				// update window size 
				int len_window = j - start + 1; 
				if (min_len > len_window) 
				{ 
					min_len = len_window; 
					start_index = start; 
				} 
			} 
		} 
	
		// If no window found 
		if (start_index == -1) 
		{ 
		System.out.println("No such window exists"); 
		return ""; 
		} 
	
		// Return substring starting from start_index 
		// and length min_len 
		return str.substring(start_index, start_index + min_len); 
	} 
	
	// Driver Method 
	public static void main(String[] args) 
	{ 
		String str = "abzptqrstab"; 
		String pat = "abt"; 
	
	System.out.print("Smallest window is :\n " + 
						findSubString(str, pat)); 
	} 
} 

