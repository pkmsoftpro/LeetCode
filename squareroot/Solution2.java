package squareroot;

/*
 * https://leetcode.com/problems/sqrtx/discuss/222141/Java-Solution2-using-Binary-Search
 */
class Solution2
{
	public int mySqrt(int n)
	{
        long start = 0, end = n;

		while(start <= end)
		{
			long mid = start + (end - start) / 2;

			if(mid * mid == n) return (int)mid;
			else if(mid * mid < n)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return (int)start - 1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().mySqrt(2147395599));
	}
}

