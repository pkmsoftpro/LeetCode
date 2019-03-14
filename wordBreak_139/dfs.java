package wordBreak_139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * https://leetcode.com/problems/word-break/discuss/43819/DFS-with-Path-Memorizing-Java-Solution
 */

//Use a set to record all position that cannot find a match in dict. That cuts down the run time of DFS to O(n^2)

public class dfs {
    public boolean wordBreak(String s, Set<String> dict) {
        // DFS
        Set<Integer> set = new HashSet<Integer>();
        return dfs(s, 0, dict, set);
    }
    
    private boolean dfs(String s, int index, Set<String> dict, Set<Integer> set){
        // base case
        if(index == s.length()) return true;
        // check memory
        if(set.contains(index)) return false;
        // recursion
        for(int i = index+1;i <= s.length();i++){
            String t = s.substring(index, i);
            if(dict.contains(t))
                if(dfs(s, i, dict, set))
                    return true;
            	//the following else block is not tested, please find any test case for this
                else
                    set.add(i);
        }
        set.add(index);
        return false;
    }
    
    public static void main(String[] args) {
		String s = "applepenapple"; //applepentapple
		List<String> dict = new ArrayList<String>(Arrays.asList(new String[]{"apple","pen"}));
		System.out.println(new dfs().wordBreak(s, new HashSet<>(dict)));
	}
}

