https://www.youtube.com/watch?v=LPFhl65R7ww&feature=youtu.be

https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/2481/share-my-ologminmn-solution-with-explanation

package medianof2sortedarray_4;

public class Solution {

	
	public static void main(String[] args) {
    	int[] nums1 = {1,2,3,5,6};
    	int[] nums2 = {4};
    	System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
}	
	public double findMedianSortedArrays(int input1[], int input2[]) {
        //if input1 length is greater than switch them so that input1 is smaller than input2.
        if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }
    	if(input1.length==0){
			int l = input2.length;
			return l%2==0?(double)(input2[l/2]+input2[l/2 -1])/2:input2[l/2];
		}
		if(input2.length==0){
			int l = input1.length;
			return l%2==0?(double)(input1[l/2]+input1[l/2 -1])/2:input1[l/2];
		}
        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }

        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
}
}
