package trappingrainwater;

public class Solution {

	public int trap(int[] h) {       
        int left = 0;
        int right = h.length - 1;
        
        int vol = 0;
        int lmax = 0;
        int rmax = 0;
        
        while(left < right){
            lmax = Math.max(lmax, h[left]);
            rmax = Math.max(rmax, h[right]);
            
            if(h[left] <= rmax){
                vol += lmax - h[left];
                left++;
            }else{
                vol += rmax - h[right];
                right--;
            }  
        }
        return vol;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(sol.trap(nums));
	}
}
