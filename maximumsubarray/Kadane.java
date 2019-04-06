package maximumsubsarray;

class Kadane {
	
	public static void main(String[] args) {
		int[] a = {16,3,-1,8,-10,1,8,-5,10,-14,15};
		System.out.println(maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}
