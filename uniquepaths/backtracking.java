package uniquepaths;

public class backtracking {

	int backtrack(int r, int c, int m, int n) {
		if (r == m-1 && c == n-1)
			return 1;
		if (r > m || c > n)
			return 0;

		return backtrack(r + 1, c, m, n) + backtrack(r, c + 1, m, n);
	}
	
	public static void main(String[] args) {
		System.out.println(new backtracking().backtrack(0,0,7,3));
	}
}
