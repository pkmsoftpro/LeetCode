package integertoroman;

//Create the buffer data(here it is table[][]). use the buffer data.

class Solution {
	public String intToRoman(int num) {
		int n = num;
		String[][] table = {
				{ "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" } };
		StringBuffer builder = new StringBuffer();
		while (n >= 1000) {
			n -= 1000;
			builder.append("M");
		}
		if (n / 100 > 0) {
			builder.append(table[2][n / 100 - 1]);
			n = n % 100;
		}
		if (n / 10 > 0) {
			builder.append(table[1][n / 10 - 1]);
			n = n % 10;
		}
		if (n > 0) {
			builder.append(table[0][n - 1]);
		}

		return builder.toString();
	}

}
