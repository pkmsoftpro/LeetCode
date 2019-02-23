package pascaltriangeII_119;

import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle-ii/discuss/38584/Another-accepted-Java-solution
 * 
 * https://leetcode.com/problems/pascals-triangle-ii/discuss/38473/Java-O(k)-solution-with-explanation
 */

public class Solution {

	public List<Integer> getRow(int k) {
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().getRow(3));
	}
}
