package pascaltriange_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/*
 * https://leetcode.com/problems/pascals-triangle/discuss/38343/Another-accepted-Java-solution
 */




public class Solution {

	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(1));
            
            for (int j = 1; j < i; j++) 
                list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                
            if (i > 0) list.add(1);
            
            res.add(list);
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().generate(3));
	}
}
