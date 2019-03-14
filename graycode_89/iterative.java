package graycode_89;

/*
 * https://leetcode.com/problems/gray-code/discuss/29984/Share-my-simple-recursive_memoization-and-iterative-solution-Java
 * 
 * https://leetcode.com/problems/gray-code/discuss/29881/An-accepted-three-line-solution-in-JAVA
 * 
 * Share my 1ms Java DP solution. Just reverse traverse n-1 answer and add 2^(n-1). E.g. If n = 1, list = {0,1}, 
 * then n = 2 will be{0,1, (1+2),(0+2)} which is {0,1,3,2}, the size of list will be doubled as before.
 */
import java.util.ArrayList;
import java.util.List;

public class iterative {

	public List<Integer> grayCode(int n) {
	    List<Integer> result = new ArrayList<Integer>();
	    if(n < 0){ return result;}
	    result.add(0);
	    for(int i = 1; i <= n; i++){
	        int increment = (int) Math.pow(2, i-1);
	        for(int j = result.size() - 1; j >= 0; j--){
	            result.add(result.get(j) + increment);
	        }
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(new iterative().grayCode(3));
	}
}
