package decodeways;

public class ipaddr {

	public int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 3; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
            int third = Integer.valueOf(s.substring(i-3, i));
            if(first >= 0 && first <= 2) {
               dp[i] += dp[i-1];  
            }
            if(second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
            if(third >=100 && third <=255){
            	dp[i] += dp[i-3];
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
		String s = "25525511135";
		System.out.println(new ipaddr().numDecodings(s));
	}
}
