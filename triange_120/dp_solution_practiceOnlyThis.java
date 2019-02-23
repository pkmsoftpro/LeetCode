package triange_120;

/*
 * https://leetcode.com/problems/triangle/discuss/38730/DP-greedy_jeantimex-for-Triangle
 * 
 * https://www.youtube.com/watch?v=ZSNWyyaxFYM
 */
import java.util.List;

import pascaltriange_118.Solution;

public class dp_solution_practiceOnlyThis {

	int minimumTotal(List<List<Integer>> triangle) {
	    int n = triangle.size();
	    List<Integer> minlen = triangle.get(n-1);
	    for (int layer = n-2; layer >= 0; layer--) // For each layer
	    {
	        for (int i = 0; i <= layer; i++) // Check its every 'node'
	        {
	            // Find the lesser of its two children, and sum the current value in the triangle with it.
	            minlen.set(i, Math.min(minlen.get(i), minlen.get(i+1)) + triangle.get(layer).get(i)); 
	        }
	    }
	    return minlen.get(0);
	}
	
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution().generate(4);
		list.get(2).set(0, 5);
		//list.get(3).set(list.get(3).size()-1, 5);
		System.out.println(new dp_solution_practiceOnlyThis().minimumTotal(list));
	}
}
