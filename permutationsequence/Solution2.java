package permutationsequence;

import java.util.ArrayList;

/*
 * https://leetcode.com/problems/permutation-sequence/discuss/22639/Concise-Java-Solution2-withDetail-Explanations
 * 

 The core idea is that denote (k-1) / (n-1)! by nth, nth represents the nth element in the candidate array should be appended to the answer string. Let's be more clear and take n = 4, k = 9 as example.

 First build you candidate array list = {1,2,3,4}; Then nth = (k-1) / (n-1)! = 8/6 = 1. which mean arrayList[1] should be removed and place to your answer string. Now answer is "2".

 Then assign k = (k-1) % (n-1)! +1 = 8%6 +1 = 3, and n= n -1 to decide the next digit. Similarly nth = (k-1) / (n-1)! = 3/2 = 1; note that now arrayList[1] = 3 since 2 has been removed in the previous iteration. Now answer is "23". Repeat that procedure until n ==0.

 */

public class Solution2 {
	public String getPermutation(int n, int k) {

		int[] factorial = new int[n];
		ArrayList<Integer> candidate = new ArrayList<Integer>();

		// Build factorial array
		for (int i = 0; i < n; i++) {
			candidate.add(i + 1);
			factorial[i] = i == 0 ? 1 : i * factorial[i - 1];
		}

		StringBuilder sb = new StringBuilder();

		// Iteratively generates answer
		while (n > 0) {
			int remain = ((k - 1) % factorial[n - 1]) + 1;
			sb.append(candidate.remove(((k - 1) / factorial[n - 1])));
			n--;
			k = remain;
		}

		return sb.toString();

	}
	
	public static void main(String[] args) {
		System.out.println(new Solution2().getPermutation(3, 3));
	}
}

/*
class Solution2 {
    public String getPermutation(int n, int k) {
        int factorial = 1;
        
        //如果n=4,factorial = (n-1)! = 3*2*1 = 6;
        for(int i=n-1;i>1;i--)
            factorial = factorial*i;
        
        StringBuilder nums = new StringBuilder("123456789");
        StringBuilder sb = new StringBuilder();
        k--;
        for(int i=n-1; i>0; i--){
            //k = 8 , index = 8/6 = 1; 
            int index = k/factorial;
            //k = 8%6 = 2 
            k = k%factorial;
            sb.append(nums.charAt(index));
            nums.deleteCharAt(index);
            
            // 6/3 = 2
            factorial = factorial/i;
        }
        sb.append(nums.charAt(0));
        return sb.toString();
    }
}
*/