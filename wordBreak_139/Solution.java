package wordBreak_139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * https://leetcode.com/problems/word-break/discuss/243471/A-different-Java-DP-solution-(complexity-depends-on-the-number-of-words-in-input-text)
 * 
 * Complexity:
Let 'w' be the number of words found in the input string. Then:

    Time complexity:
        average: O(w^2)
        worst-case: O(n^2)
            should be rare, because in average the number of words << length of the text
    Space complexity: O(w)

 */

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return canBeBrokenIntoWords(s.toCharArray(), 0, new HashSet<>(wordDict));
    }
	
    private boolean canBeBrokenIntoWords(char[] t, int s, Set<String> dictionary) {
        List<Integer> validIndices = new ArrayList<>(Arrays.asList(t.length));

        for (int i = t.length - 1; i >= 0; i--) {

            for (Integer endIndex : validIndices) {
                String candidate = String.valueOf(Arrays.copyOfRange(t, i, endIndex));
                if (dictionary.contains(candidate)) {
                    validIndices.add(i);
                    break;
                }
            }
        }

        return validIndices.contains(0);
    }
    
    public static void main(String[] args) {
		String s = "iapplepenapplet";
		List<String> dict = new ArrayList<String>(Arrays.asList(new String[]{"apple","pen"}));
		System.out.println(new Solution().wordBreak(s, dict));
	}
}
