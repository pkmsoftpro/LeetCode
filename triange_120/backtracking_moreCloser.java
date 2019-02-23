package triange_120;

import java.util.List;

import pascaltriange_118.Solution;

public class backtracking_moreCloser {

private int min = Integer.MAX_VALUE;
    
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        helper(0, triangle, 0, 0);
        return min;
    }
    
    private void helper(int cur, List<List<Integer>> triangle, int level, int i) {
        if (level == triangle.size()) {
            min = Math.min(cur, min);
            return;
        }
        
        int a = triangle.get(level).get(i);
        helper(cur + a, triangle, level+1, i);
        
        if (i < level) {
            int b = triangle.get(level).get(i+1);
            helper(cur + b, triangle, level+1, i+1);    
        }
    }
	
	public static void main(String[] args) {
		List<List<Integer>> list = new Solution().generate(4);
		list.get(2).set(0, 5);
		//list.get(3).set(list.get(3).size()-1, 5);
		System.out.println(new backtrack().minimumTotal(list));
	}
}
