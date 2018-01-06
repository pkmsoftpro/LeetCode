package com.practice;

class Solution {
    public boolean isMatch(String s, String p) {
        // base case: empty p string
        if (p.length() == 0){
            return s.length() == 0;
        }else if (p.length() == 1){  //base case 2: last regex character 
            if (s.length() != 1){   //only a single character must be present 
                return false;
            }
            if (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)){  //regex string contains exact character or operator for any
                return true;
            }else{
                return false;
            }
        }
        
        //recursive case: zero or more of preceeding character 
        if (p.charAt(1) == '*'){
            if (isMatch(s, p.substring(2))){ //zero of preceeding element
                return true;
            }
            //1 or more of preceeding element
            int i = 0;
            while(i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')){
                if (isMatch(s.substring(i + 1), p.substring(2))){
                    return true;
                }
                i++;
            }
            return false;
        }else{  //recursive case: exact match or any single character 'operator' ('.')
            if (s.length() == 0){  //ensure string has not gone empty
                return false; 
            }
            if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'){ //move on to next character if the current is a match
                return isMatch(s.substring(1), p.substring(1));
            }else{
                return false;
            }
        }
         
    }
}