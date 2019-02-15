package decodeways;
/*
 * https://leetcode.com/problems/decode-ways/discuss/233731/my-simple-java-solution
 */

public class recursive {
    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 1;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int num = s.charAt(0) - '0', num2 = s.charAt(1) - '0';
		return numDecodings(s.substring(1))
				+ ((num == 1 || num == 2 && num2 <= 6) ? numDecodings(s
						.substring(2)) : 0);
    }

    public static void main(String[] args) {
		String s = "1456";
		System.out.println(new recursive().numDecodings(s));
	}
}
