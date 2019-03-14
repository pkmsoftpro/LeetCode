package singlenumber_137;

/*
https://leetcode.com/problems/single-number-ii/discuss/43294/Challenge-me-thx
*/
class Solution {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
    }
    return ones;
}
}

/*
https://leetcode.com/problems/single-number-ii/discuss/236368/Java-Solutions

Solution 1: Bit Manipulation

Time complexity: O(n)
Space complexity: O(1)

class Solution 
{
	public int singleNumber(int[] A)
	{
		int ones = 0, twos = 0;
		
		for(int n : A)
		{
			ones = (ones ^ n) & ~twos;
			twos = (twos ^ n) & ~ones;
		}
		return ones;
	}
}

Solution 2: General Solution for K

Time complexity: O(n)
Space complexity: O(1)

class Solution
{
	public int singleNumber(int[] A)
	{
		int result = 0;
		int K = 3;						// Every element appears three times except for one
		
		for(int i = 0; i < 32; i++)
		{
			int sum = 0;
			for(int n: A)
			{
				if((n >> i & 1) == 1)
					sum++;
			}
			sum %= K;
			result |= sum << i;
		}
		return result;
	}
}

Solution 3: Using HashMap

Time complexity: O(n)
Space complexity: O(n)

class Solution 
{
    public int singleNumber(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(int n : A)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int n : A)
        {
            if(map.get(n) == 1)
                return n;
        }
        return -1;
    }
}
*/
