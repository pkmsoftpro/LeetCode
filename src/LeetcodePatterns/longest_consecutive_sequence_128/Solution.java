package LeetcodePatterns.longest_consecutive_sequence_128;

// https://leetcode.com/problems/longest-consecutive-sequence/solutions/41055/my-really-simple-java-o-n-saddlebackvariant-accepted/
// https://leetcode.com/problems/longest-consecutive-sequence/solutions/41057/simple-o-n-with-explanation-just-walk-each-streak/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {100, 4, 200, 1, 3, 2};
    int seq = new Solution().longestConsecutive(nums);
    System.out.println(seq);
  }

  public int longestConsecutive(int[] num) {
    int best = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int n : num)
      if (!map.containsKey(n)) {
        int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
        int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
        // sum: length of the sequence n is in
        int sum = left + right + 1;
        map.put(n, sum);

        // keep track of the max length
        best = Math.max(best, sum);

        // extend the length to the boundary(s)
        // of the sequence
        // will do nothing if n has no neighbors
        map.put(n - left, sum);
        map.put(n + right, sum);
      }
    
    return best;
  }

  public int longestConsecutive1(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums)
      set.add(n);
    int best = 0;

    for (int num : nums) {
      if (!set.contains(num - 1)) {
        int next = num + 1;
        while (set.contains(next))
          ++next;
        best = Math.max(best, next - num);
      }
    }
    return best;
  }
}
