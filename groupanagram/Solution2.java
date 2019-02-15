package groupanagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        
        for (String str : strs) {
            int key = getHashCode(str);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
                ans.add(list);
            } else {
                map.get(key).add(str);
            }
        }
        
        return ans;
    }
    
    // O(str.length())
    private int getHashCode(String str) {
        int[] array = new int[26];        
        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 'a'] += 1;
        }        
        return Arrays.hashCode(array); // O(array.length) , which is O(26) = O(1)
    }
    

	
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(new Solution2().groupAnagrams(strs));
	}
}