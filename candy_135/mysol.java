package candy_135;

/*
 * one pass solution:
 * https://leetcode.com/problems/candy/discuss/42770/One-pass-constant-space-Java-solution
 * 
 * jeantimex:
 * https://leetcode.com/problems/candy/discuss/42868/Java-O(n)-solution
 */

public class mysol {

	public int candy(int[] ratings) {
        
		int[] res = new int[ratings.length];
		res[0]=1;
		for(int i=0;i<ratings.length-1;i++){
			if(ratings[i]>ratings[i+1]){
				bpropagate(ratings,res, i);
			} else if(ratings[i]==ratings[i+1]){
				res[i+1]=1;
			} else res[i+1]=res[i]+1;
		}
		int i=0,sum=0;
		while(i<res.length)
			sum = sum+res[i++];
		return sum;
    }
	
	public int[] bpropagate(int[] ratings, int[] res, int i){
		res[i+1]=res[i+1]+1;
		while(i>-1 && ratings[i]>ratings[i+1] && res[i]<=res[i+1]){
			res[i]=res[i]+1;
			i--;
		}
		return res;
	}
	//[1,2,87,87,87,2,1]
	//[1,0,2]
	//[1,3,2,2,1]

	public static void main(String[] args) {
		int[] ratings = {1,2,87,87,87,2,1};
		System.out.println(new mysol().candy(ratings));
	}
}
