//https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

/* A Naive Java Program for LIS Implementation */
class LIS 
{ 
   static int max_ref; // stores the LIS 
  
   /* To make use of recursive calls, this function must return 
   two things: 
   1) Length of LIS ending with element arr[n-1]. We use 
      max_ending_here for this purpose 
   2) Overall maximum as the LIS may end with an element 
      before arr[n-1] max_ref is used this purpose. 
   The value of LIS of full array of size n is stored in 
   *max_ref which is our final result */
   static int _lis(int arr[], int n) 
   { 
       // base case 
       if (n == 1) 
           return 1; 
  
       // 'max_ending_here' is length of LIS ending with arr[n-1] 
       int res, max_ending_here = 1; 
  
        /* Recursively get all LIS ending with arr[0], arr[1] ... 
           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and 
           max ending with arr[n-1] needs to be updated, then 
           update it */
        for (int i = 1; i < n; i++) 
        { 
            res = _lis(arr, i); 
            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here) 
                max_ending_here = res + 1; 
        } 
  
        // Compare max_ending_here with the overall max. And 
        // update the overall max if needed 
        if (max_ref < max_ending_here) 
           max_ref = max_ending_here; 
  
        // Return length of LIS ending with arr[n-1] 
        return max_ending_here; 
   } 
  
    // The wrapper function for _lis() 
    static int lis(int arr[], int n) 
    { 
        // The max variable holds the result 
         max_ref = 1; 
  
        // The function _lis() stores its result in max 
        _lis( arr, n); 
  
        // returns max 
        return max_ref; 
    } 
  
    // driver program to test above functions 
    public static void main(String args[]) 
    { 
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println("Length of lis is "
                           + lis(arr, n) + "\n"); 
    } 
 } 
 
 Complexity Analysis:

Time Complexity: The time complexity of this recursive approach is exponential as there is a case of overlapping subproblems as explained in the recursive tree diagram above.
Auxiliary Space: O(1). No external space used for storing values apart from the internal stack space.
 
 
 
 /* Dynamic Programming Java implementation  
   of LIS problem */
  
class LIS 
{ 
    /* lis() returns the length of the longest  
       increasing subsequence in arr[] of size n */
    static int lis(int arr[],int n) 
    { 
          int lis[] = new int[n]; 
          int i,j,max = 0; 
  
          /* Initialize LIS values for all indexes */
           for ( i = 0; i < n; i++ ) 
              lis[i] = 1; 
  
           /* Compute optimized LIS values in  
              bottom up manner */
           for ( i = 1; i < n; i++ ) 
              for ( j = 0; j < i; j++ )  
                         if ( arr[i] > arr[j] &&  
                                  lis[i] < lis[j] + 1) 
                    lis[i] = lis[j] + 1; 
  
           /* Pick maximum of all LIS values */
           for ( i = 0; i < n; i++ ) 
              if ( max < lis[i] ) 
                 max = lis[i]; 
  
            return max; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
            int n = arr.length; 
            System.out.println("Length of lis is " 
                              + lis( arr, n ) + "\n" ); 
    } 
} 


Complexity Analysis:

Time Complexity: O(n2).
As nested loop is used.
Auxiliary Space: O(n).
Use of any array to store LIS values at each index.
