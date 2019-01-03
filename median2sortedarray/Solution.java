package median2sortedarray;
class Solution {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int totalLength=nums1.length+nums2.length;
        boolean even=totalLength%2==0;
        int m=totalLength/2;
        
        int n1=0;
        int n2=0;
        int i=0;        
        int total=0;
        while(i<totalLength){
            int val1=0;
            int val2=0;
            if (n1<nums1.length && nums1.length>0) val1=nums1[n1];
            if (n2<nums2.length && nums2.length>0) val2=nums2[n2];
            int val;
            
            if (n1==nums1.length ||  nums1.length==0){
                val=val2;
                n2++;                
            }
            else if  (n2==nums2.length ||  nums2.length==0){
                val=val1;
                n1++;
            }
            else{
                 if(val1<=val2){
                    val=val1;
                    n1++;
                }
                else{
                    val=val2;
                    n2++;
                }               
            }
            
            if (even && i==m-1){
                total+=val;   
            }
            if(i==m){
                total+=val;   
                break;
            }
            
            i++;                
               
        }
        
        double median=total;
        if (even){
            median = median/2.0;
        }
            
        return median;
    }
    
    public static void main(String[] args) {
    	int[] nums1 = {1, 2,8};
    	int[] nums2 = {3, 4};
    	System.out.println(findMedianSortedArrays(nums1, nums2));
	}
    
}