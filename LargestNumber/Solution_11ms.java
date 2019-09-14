//https://leetcode.com/problems/largest-number/discuss/53279/QuickSort-in-java-beating-94


class Solution_11ms {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) strs[i] = String.valueOf(nums[i]);
        quickSort(strs, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) sb.append(strs[i]);
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
    
    public int compare(String s1, String s2, int start1, int start2){  // 1 if s1 > s2, -1 if <
        int temp1 = start1, temp2 = start2;
        while(temp1 < s1.length() && temp2 < s2.length()){
            if(s1.charAt(temp1) > s2.charAt(temp2)) return 1;
            else if(s1.charAt(temp1) < s2.charAt(temp2)) return -1;
            temp1++;
            temp2++;
        }
        if(temp1 == s1.length() && temp2 == s2.length()) return 0;
        if(temp1 == s1.length()) return compare(s1, s2, start1, temp2);
        return compare(s1, s2, temp1, start2);
    }
    
    public void quickSort(String[] strs, int lo, int hi){
        if(lo >= hi) return;
        String pivotValue = strs[lo];
        strs[lo] = strs[hi];
        strs[hi] = pivotValue;
        int i = lo - 1, j = hi;
        do {
            do{i++;} while(compare(strs[i], pivotValue, 0, 0) == -1);
            do{j--;} while((compare(strs[j], pivotValue, 0, 0) == 1) && j > lo);
            if(i < j){
                String temp = strs[i];
                strs[i] = strs[j];
                strs[j] = temp;
            }
        } while(i < j);
        strs[hi] = strs[i];
        strs[i] = pivotValue;
        quickSort(strs, lo, i - 1);
        quickSort(strs, i + 1, hi);
    }
    
    public static void main(String[] args) {
    	int[] arr = {9,31,4};
		Solution_11ms sol = new Solution_11ms();
		System.out.println(sol.largestNumber(arr)); 
	}
}