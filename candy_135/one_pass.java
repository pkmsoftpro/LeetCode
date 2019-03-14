package candy_135;

/*
 * https://leetcode.com/problems/candy/discuss/42770/One-pass-constant-space-Java-solution
 */

public class one_pass {

	public int candy(int[] ratings) {
        int total = 1, prev = 1, countDown = 0;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] >= ratings[i-1]) {
                if (countDown > 0) {
                    total += countDown*(countDown+1)/2; // arithmetic progression
                    if (countDown >= prev) total += countDown - prev + 1;
                    countDown = 0;
                    prev = 1;
                }
                prev = ratings[i] == ratings[i-1] ? 1 : prev+1;
                total += prev;
            } else countDown++;
        }
        if (countDown > 0) { // if we were descending at the end
            total += countDown*(countDown+1)/2;
            if (countDown >= prev) total += countDown - prev + 1;
        }
        return total;
    }
	
	public static void main(String[] args) {
		int[] ratings = {1,2,87,87,87,2,1};
		System.out.println(new one_pass().candy(ratings));
	}
}
