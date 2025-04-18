package LeetcodePatterns.letter_case_permutation_784;
//https://leetcode.com/problems/letter-case-permutation/solutions/115485/java-easy-bfs-dfs-saddlebackvariant-with-explanation/

import java.util.LinkedList;
import java.util.List;

public class DFS {
  public List<String> letterCasePermutation(String S) {
    if (S == null) {
      return new LinkedList<>();
    }

    List<String> res = new LinkedList<>();
    helper(S.toCharArray(), res, 0);
    return res;
  }

  public void helper(char[] chs, List<String> res, int pos) {
    if (pos == chs.length) {
      res.add(new String(chs));
      return;
    }
    if (chs[pos] >= '0' && chs[pos] <= '9') {
      helper(chs, res, pos + 1);
      return;
    }

    chs[pos] = Character.toLowerCase(chs[pos]);
    helper(chs, res, pos + 1);

    chs[pos] = Character.toUpperCase(chs[pos]);
    helper(chs, res, pos + 1);
  }
}
