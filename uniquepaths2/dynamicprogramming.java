package uniquepaths2;

public class dynamicprogramming {

	public static void main(String[] args) {
		int[][] nums = {{0,0}};
		/*		  {0,0,0},
				  {0,1,0},
				  {0,0,0}
				};*/
		System.out.println(new dynamicprogramming().uniquePathsWithObstacles(nums));
	}

	public int uniquePathsWithObstacles(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        if(m==1 && n==1){
        	return nums[m-1][n-1] == 0?1:0;
        }
		for(int i=0;i<n;i++){
			nums[0][i]=1;
		}
		for(int j=0;j<m;j++){
			nums[j][0]=1;
		}
		if(m<2){
			for(int i=0;i<n;i++){
				if(nums[0][i]==1) return 0;
			}
			return 1;
		}
		if(n<2){
			for(int i=0;i<m;i++){
				if(nums[i][0]==1) return 0;
			}
			return 1;
		}
		if(n%2==1)nums[m/2][n/2] = 0;
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(i-1>-1 && j-1>-1)nums[i][j] =nums[i-1][j]+nums[i][j-1];
			}
		}
		return nums[m-1][n-1];
    }
}
