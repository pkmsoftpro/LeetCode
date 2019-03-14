package wordBreak_II_140;

/*
 * https://leetcode.com/problems/word-break-ii/discuss/44167/My-concise-JAVA-solution-based-on-memorized-DFS
 * 
 * There are several ways to improve the naive dfs method:
 *  (1) memo using hashmap (like the one above) (2) DP 
 *  (3) preprocess the string using word break I DP array to determine whether to go on or not 
 *  (4) precompute the max length of all words in the dictionary to reduce the 
 *      number of recursive calls. 
 *  These are all good approaches when not all combinations are valid, but won't change the 
 *  time complexity O(2^n) in the worse case scenario where all combinations of the string are correct 
 *  (e,g, s=aaa, dic=[a, aa, aaa]). Some might argue that they reduce the number of recursive/iterative calls to 
 *  n^2 using memo or DP just like word break I. However, the time complexity of each recursive call in this approach 
 *  is not linear anymore. Imagine the length of sublist is 2^(n-1). Optimization only happens when the return value 
 *  is a integer or boolean. This is why we don't use DP/memo to solve subsets/permutation problem because all 
 *  combinations are valid. In addition, the code below combines (1) and (4) and beats 99% as the solution above 
 *  suffers the problem that the dictionary size might be too large.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sol_dico {
    int maxLen = 0;
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> hs = new HashSet<>();
        for(String w: wordDict)
        {
            hs.add(w);
            if(w.length()>maxLen) maxLen = w.length(); //get the maxLen of words
        }
        Map<Integer, List<String>> map = new HashMap<>();
        return helper(hs, s, 0, map);      
    }
    
    public List<String> helper(Set<String> hs, String s, int start, Map<Integer, List<String>> map)
    {
        if(map.containsKey(start)) return map.get(start);
        List<String> list = new ArrayList<>(); 
        if(start==s.length())  list.add("");
        //reduce the # of iterations using maxLen
        for(int i=start; i<start+maxLen&&i<s.length(); i++)
        {
            if(hs.contains(s.substring(start, i+1)))
            {
                List<String> nexts = helper(hs, s, i+1, map);
                for(String next:nexts)
                {
                    if(next=="")//reaches the end
                        list.add(s.substring(start, i+1)+next);
                    else
                        list.add(s.substring(start, i+1) + " " + next);
                }
            }
        }
        map.put(start, list); 
        return list;
    }
}
