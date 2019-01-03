package containerwithmostwater;

class Sol2 {
    
    /*
     * 1,9,3,4,5,6,7,8
     * 
    Thought : 2 pointer Technique : Water at any level is min(ht[l], ht[r]) * (r - l)
    */
    public static int maxArea(int[] height) {
        //1,9,3,4,5,6,7,8
        int l = 0, r = height.length - 1;
        int max = 0;
        
        while(l < r) {
            //1,9,3,4,5,6,7,8
            int hl = height[l];
            int hr = height[r];
            int ht = 0;
            
            if(hl < hr) {
                ht = hl * (r - l);
                
                // anything smaller than or equal to hl will hold less water
                while((l < r) && hl >= height[++l]);
                
            } else {
                ht = hr * (r - l);
                
                // anything smaller than or equal to hr will hold less water
                while((l < r) && hr >= height[--r]);
            }
            
            max = Math.max(max, ht);
        }
        
        return max;
    }
    
    
    public static void main(String[] args) {
		/*int[] arr = {1,8,6,2,5,4,8,3,7};*/
		int[] arr = {1,9,3,4,5,6,7,8};
		System.out.println(maxArea(arr));
	}
}
