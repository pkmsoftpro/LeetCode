/*
https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf
http://mathworld.wolfram.com/NewtonsIteration.html
https://leetcode.com/problems/sqrtx/discuss/223487/98-java-with-Newton-iteration
*/
public class Solution3 {

    public int mySqrt(int x) {
        double result =1;
        for(int i=0;i<20;i++){
        	result = 0.5*(result+x/result);
        }
    	return (int)result;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().mySqrt(2147395599));
	}
}

