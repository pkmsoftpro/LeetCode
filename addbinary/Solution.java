package addbinary;

public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder sb1 = new StringBuilder(a).reverse();
        StringBuilder sb2 = new StringBuilder(b).reverse();
        int len1 = a.length(),len2 = b.length(), i=0;
        StringBuilder result = new StringBuilder("");
        int num1,num2;
        int carry =0;
        while(len1>0 || len2>0 || carry>0){
        	if(i<a.length()) {
        		num1=Character.getNumericValue(sb1.charAt(i));
        	} else num1 =0;
        	if(i<b.length()){
        		num2=Character.getNumericValue(sb2.charAt(i));
        	} else num2 =0;
        	if(num1+num2+carry==1) {
        		result.append(1);
        		if(carry==1) carry=0;
        	}
        	else if(num1+num2+carry==2){
        		result.append(0);
        		carry =1;
        	} else if(num1+num2+carry==0){
        		result.append(0);
        		carry=0;
        	} else if(num1+num2+carry==3){
        		result.append(1);
        		carry=1;
        	}
        	i++;
        	len1--;
        	len2--;
        }
    	return result.reverse().toString();
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().addBinary("11", "1"));
	}
}
