package candy_135;

public class sol_jeantimex_2pass {

	public int candy(int[] ratings) {
		  if (ratings == null || ratings.length == 0) return 0;
		  
		  int n = ratings.length;
		  
		  // a[i] stores the num of candies of i-th kid
		  int[] a = new int[n]; a[0] = 1;
		  
		  // scan from left to right
		  for (int i = 1; i < n; i++)
		    a[i] = (ratings[i] > ratings[i - 1]) ? a[i - 1] + 1 : 1;
		  
		  // scan from right to left
		  int sum = a[n - 1];
		  
		  for (int i = n - 2; i >= 0; i--) {
		    if (ratings[i] > ratings[i + 1])
		      a[i] = Math.max(a[i], a[i + 1] + 1);
		        
		    sum += a[i];
		  }
		  
		  return sum;
		}
	
	public static void main(String[] args) {
			int[] ratings = {1,2,87,87,87,2,1};
			System.out.println(new sol_jeantimex_2pass().candy(ratings));
		}
}
