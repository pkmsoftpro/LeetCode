package distinctsubsequence_115;

//Java program to count number of times 
//S appears as a subsequence in T 

class GFG { 
	static int findSubsequenceCount(String S, String T) 
	{ 
		int Tlen = T.length(); 
		int Slen = S.length(); 

		// T can't appear as a subsequence in S 
		if (Tlen > Slen) 
			return 0; 

		// mat[i][j] stores the count of 
		// occurrences of T(1..i) in S(1..j). 
		int mat[][] = new int[Tlen + 1][Slen + 1]; 

		// Initializing first column with 
		// all 0s. An emptystring can't have 
		// another string as suhsequence 
		for (int i = 1; i <= Tlen; i++) 
			mat[i][0] = 0; 

		// Initializing first row with all 1s. 
		// An empty string is subsequence of all. 
		for (int j = 0; j <= Slen; j++) 
			mat[0][j] = 1; 

		// Fill mat[][] in bottom up manner 
		for (int i = 1; i <= Tlen; i++) { 
			for (int j = 1; j <= Slen; j++) { 
				// If last characters don't match, 
				// then value is same as the value 
				// without last character in S. 
				if (T.charAt(i - 1) != S.charAt(j - 1)) 
					mat[i][j] = mat[i][j - 1]; 

				// Else value is obtained considering two cases. 
				// a) All substrings without last character in S 
				// b) All substrings without last characters in 
				// both. 
				else
					mat[i][j] = mat[i][j - 1] + mat[i - 1][j - 1]; 
			} 
		} 

		/* uncomment this to print matrix mat 
		for (int i = 1; i <= m; i++, cout << endl) 
			for (int j = 1; j <= n; j++) 
				System.out.println ( mat[i][j] +" "); */
		return mat[Tlen][Slen]; 
	} 

	// Driver code to check above method 
	public static void main(String[] args) 
	{ 
		String T = "ge"; 
		String S = "geeksforgeeks"; 
		System.out.println(findSubsequenceCount(S, T)); 
	} 
} 
//This code is contributed by vt_m 

