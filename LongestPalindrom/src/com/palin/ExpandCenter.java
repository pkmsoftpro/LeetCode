package com.palin;

public class ExpandCenter {
	
	public static void main(String[] args) {
		ExpandCenter ec = new ExpandCenter();
		System.out.println(ec.getLongestPalindrom("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
	
	public String populatehash(String s){
		String retval = "";
		for(int i=0;i<s.length();i++){
			retval = retval + s.charAt(i)+"#";
		}
		retval = "#" + retval;
		return retval;
	}
	
	public String getLongestPalindrom(String s){
		StringBuilder rev = new StringBuilder(s).reverse();
		if(rev.toString().equals(s)) return s;
			s = populatehash(s);
		
		StringBuilder temp = null;
		String maxa = ""+s.charAt(0);
		for(int i=0;i<s.length();i++){
			int center = i;
			temp=new StringBuilder(""+s.charAt(i));
			/*
			 * if (i - 1 >= 0 && temp.toString().equals("" + s.charAt(i - 1)) &&
			 * maxa.length()==1) maxa = temp.append(s.charAt(i - 1)).toString();
			 * if (i + 1 < s.length() && temp.toString().equals("" + s.charAt(i
			 * + 1)) && maxa.length()==1) maxa = temp.append(s.charAt(i +
			 * 1)).toString(); temp=new StringBuilder(""+s.charAt(i));
			 */
			int j=1;
			while(i-j>=0 && i+j<s.length()){
				temp = temp.append(s.charAt(i+j)).reverse().append(s.charAt(i-j)).reverse();
				if(temp.toString().equals(temp.reverse().toString()) 
						&& s.contains(temp.toString())
						&& temp.length()>maxa.length()) maxa = temp.toString();
				temp.reverse();
				j++;
			}
		} if(maxa.contains("#")){
			maxa = maxa.replaceAll("#", "");
		}
		return maxa;
	}
	
	public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
