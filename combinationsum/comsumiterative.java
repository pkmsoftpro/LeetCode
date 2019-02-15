package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * This solution:
 * https://leetcode.com/problems/combination-sum/discuss/16559/Non-Recursive-JAVA-solution
 * 
 * honorable mentions:
 * https://leetcode.com/problems/combination-sum/discuss/16829/A-recursive-yet-efficient-Java-solution-with-explanation
 */
public class comsumiterative {

	public static List<List<Integer>> combinationSumni(int[] candidates, int target) {
	    Arrays.sort(candidates);
	    int i=0, size = candidates.length, sum=0;
	    Stack<Integer> combi = new Stack<>(), indices = new Stack<>();
	    List<List<Integer>> result = new ArrayList<>();
	    while (i < size) {
	    	if (sum + candidates[i]>= target) {
	    		if (sum + candidates[i] == target) {
	    			combi.push(candidates[i]);
	    			result.add(new ArrayList<>(combi));
	    			combi.pop();
	    		}
	    		// indices stack and combination stack should have the same size 
	    		// all the time
	    		if (!indices.empty()){
	    			sum -= combi.pop();
	    			i = indices.pop();
	    			while (i == size-1 && !indices.empty()) {
	    				i = indices.pop();
	    				sum -= combi.pop();
	    				
	    			}
	    		}
	    		i++;
	    	} else {
	    		combi.push(candidates[i]);
	    		sum +=candidates[i];
	    		indices.push(i);
	    	}
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3};
		int target = 7;
		System.out.println(combinationSumni(nums,target));
	}
}
