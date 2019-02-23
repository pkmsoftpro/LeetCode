package longestconsecutiveseq_128;

/*Stefen Pochmann:
 * https://leetcode.com/problems/longest-consecutive-sequence/discuss/41057/Simple-O(n)-with-Explanation-Just-walk-each-streak
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        
        int maxLen = 0;
        for (int num : nums) {
            if (!set.remove(num)) continue;  // removed number
            int i = 0, j = 0;
            for (i = num; set.remove(++i);) {}
            for (j = num; set.remove(--j);) {}
            maxLen = Math.max(maxLen, i - j - 1);
        }
        return maxLen;
    }
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		System.out.println(new Solution().longestConsecutive(nums));
	}
}
