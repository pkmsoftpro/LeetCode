
class Solution {
	
	public static double merge(int[] nums1, int[] nums2){
		if(nums1.length==1 && nums2.length==1){
			if(nums1[0]>nums2[0]){
				double z = nums1[0];
				nums1[0]=nums2[0];
				nums2[0]=(int)z;
			}
		}
		if(nums1.length==0 && nums2.length==0){
			return 0.0;
		}
		if(nums1.length==0){
			if(nums2.length%2==0){
				return (double)(nums2[nums2.length/2]+nums2[nums2.length/2 -1])/2;
			} else return (double)nums2[nums2.length/2];
		}
		if(nums2.length==0){
			if(nums1.length%2==0){
				return (double)(nums1[nums1.length/2]+nums1[nums1.length/2 -1])/2;
			} else return (double)nums1[nums1.length/2];
		}
		int[] l1 = nums1;
		int[] l2 = nums2;
		int x = nums1.length+nums2.length;
		int[] mergedArray = new int[x];
		int i=0,j=0,t=0;
		for(int m=0;m<x;m++){
			if(i<l1.length && l1[i]<=l2[j]){
				mergedArray[m]=l1[i];
				//if(l1.length>=i+1){i++;};
				if(i<l1.length)i++;
			} else if(j<l2.length) {
				if(t<1)mergedArray[m]=l2[j];
				else {
					mergedArray[m]=l1[i];
					i++;
				}
				//if(l2.length>=j+1){j++;};
				if(j+1<l2.length){
					j++;
				} else t++;
			}
			
		}
		if((x)%2==0){
			return (double)(mergedArray[(x)/2]+mergedArray[(x)/2 - 1])/2;
		}
		else return (double)mergedArray[(x)/2];
	}
    public static void main(String[] args){
        //int[] nums1 = {1,3};
        //int[] nums2 = {2};
        //int[] nums1 = {1,2};
        //int[] nums2 = {3,4};
    	/*int[] nums1 = {100001};
        int[] nums2 = {100000};*/
    	int[] nums1 = {2,3};
        int[] nums2 = {1};
        System.out.println(merge(nums1, nums2));
    	
    }
}