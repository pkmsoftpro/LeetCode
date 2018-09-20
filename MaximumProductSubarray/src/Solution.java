class MaxProduct {
    int r; 
    public int maxProduct(int[] A) {

        r = A[0];

        maxProductHelper(A, r, 1); 
        return r; 
    }
    
    public void maxProductHelper(int[] A, int product, int i){
        if(i >= A.length) return; 
        
        int imax = Math.max(A[i], A[i] * product); 
        r = Math.max(imax, r); 
        
        maxProductHelper(A, A[i], i+1);  
        
        product *= A[i]; 
        maxProductHelper(A, product, i+1); 
    }
}

public class Solution {
	public static void main(String[] args) {
		MaxProduct mp = new MaxProduct();
		int[] A = {2,3,-2,-4,-1,8,6};
		System.out.println(mp.maxProduct(A));
	}
}