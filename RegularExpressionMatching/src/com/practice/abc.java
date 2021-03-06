package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solutions {
    public boolean isMatch(String s, String p) {
       if(p.isEmpty() && s.isEmpty()) return true;
		if(p.charAt(0)=='.' || s.charAt(0)==p.charAt(0)){
			if(p.charAt(0)=='.') return isMatch(s.substring(1), p.substring(1));
			if(p.length()>=2 && p.charAt(1)=='*'){
				return isMatch(removeSame(s,p.charAt(0)), p.substring(2));
			} else return isMatch(s.substring(1), p.substring(1));
			
		} else return false;
    }
    public String removeSame(String str,char c){
		String retval = null;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				retval = str.substring(i+1);
			} else break;
		}
		return retval;
	}
}

public class abc {
    public static String stringToString(String input) {
        assert input.length() >= 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '\\') {
                char nextChar = input.charAt(i+1);
                switch (nextChar) {
                    case '\"': sb.append('\"'); break;
                    case '/' : sb.append('/'); break;
                    case '\\': sb.append('\\'); break;
                    case 'b' : sb.append('\b'); break;
                    case 'f' : sb.append('\f'); break;
                    case 'r' : sb.append('\r'); break;
                    case 'n' : sb.append('\n'); break;
                    case 't' : sb.append('\t'); break;
                    default: break;
                }
                i++;
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            line = in.readLine();
            String p = stringToString(line);
            
            boolean ret = new Solutions().isMatch(s, p);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
