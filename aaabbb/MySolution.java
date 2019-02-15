package aaabbb;

public class MySolution {

	public String strWithout3a3b(int A, int B) {
		String retVal = "";
		int t = A+B;
		if (A >= B) {
			if (A == 1) {
				if (B > 1) {
					retVal += "bb";
					B -= 2;
				} else if (B > 0) {
					retVal += "b";
					B--;
				}
			}
			while (A > 0 || B > 0) {
				if (A >= 2) {
					retVal += "aa";
					A -= 2;
				} else if (A > 0) {
					retVal += "a";
					A--;
				}
				if (B >= 2) {
					retVal += "bb";
					B -= 2;
				} else if (B > 0) {
					retVal += "b";
					B--;
				}
			}
		} else {
			if (B == 1) {
				if (A > 1) {
					retVal += "aa";
					A -= 2;
				} else if (A > 0) {
					retVal += "a";
					A--;
				}
			}
			while (A > 0 || B > 0) {
				if (B >= 2) {
					retVal += "bb";
					B -= 2;
				} else if (B > 0) {
					retVal += "b";
					B--;
				}
				if (A >= 2) {
					retVal += "aa";
					A -= 2;
				} else if (A > 0) {
					retVal += "a";
					A--;
				}
			}
		}
		while(retVal.contains("aaa")){
			if(retVal.contains("aaaa")){
				int i = retVal.indexOf("aaaa");
				retVal = retVal.substring(0,i+2)+retVal.substring(i+4);
				if(retVal.contains("bb")){
					int j = retVal.indexOf("bb");
					retVal = retVal.substring(0,j)+"baab"+retVal.substring(j+2);
				}
			} else {
				int i = retVal.indexOf("aaa");
				retVal = retVal.substring(0,i+2)+retVal.substring(i+3);
				if(retVal.contains("bb")){
					int j = retVal.indexOf("bb");
					retVal = retVal.substring(0,j)+"bab"+retVal.substring(j+2);
				}
			}
		}
		while(retVal.contains("bbb")){
			if(retVal.contains("bbbb")){
				int i = retVal.indexOf("bbbb");
				retVal = retVal.substring(0,i+2)+retVal.substring(i+4);
				if(retVal.contains("aa")){
					int j = retVal.indexOf("aa");
					retVal = retVal.substring(0,j)+"abba"+retVal.substring(j+2);
				}
			} else {
				int i = retVal.indexOf("bbb");
				retVal = retVal.substring(0,i+2)+retVal.substring(i+3);
				if(retVal.contains("aa")){
					int j = retVal.indexOf("aa");
					retVal = retVal.substring(0,j)+"aba"+retVal.substring(j+2);
				}
			}
		}
		return retVal.length()==t?retVal:retVal.substring(0,retVal.length()-1);
	}

	public static void main(String[] args) {
		System.out.println(new MySolution().strWithout3a3b(2, 5));
	}
}
