package ipaddress;
/*
 * http://massivealgorithms.blogspot.com/2014/06/leetcode-restore-ip-addresses-darrens.html
 * 
 * http://www.jiuzhang.com/solutions/restore-ip-addresses/
 * 
 * https://www.programcreek.com/2014/06/leetcode-restore-ip-addresses-java/
 */

import java.util.ArrayList;

public class backtracking {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<String>();
        
        if(s.length() <4 || s.length() > 12)
            return list;
        
        helper(list, new ArrayList<String>(), s , 0);
        return list;
    }
    
    public void helper(ArrayList<String> list, ArrayList<String> tempList, String s, int start){
        if(tempList.size() == 4 && start==s.length()){
            
            StringBuffer sb = new StringBuffer();
            for(String tmp: tempList){
                sb.append(tmp);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            list.add(sb.toString());
            return;
        }
        
        for(int i=start; i<s.length() && i<= start+3; i++){
        /*for(int i=start; i<s.length(); i++){     -->both works*/
            String tmp = s.substring(start, i+1);
            if(isvalid(tmp)){
                tempList.add(tmp);
                helper(list, tempList, s, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    
    private boolean isvalid(String s){
        if(s.charAt(0) == '0')
            return s.equals("0"); // to eliminate cases like "00", "10"
        int digit = Integer.valueOf(s);
        return digit >= 0 && digit <= 255;
    }
    
    public static void main(String[] args) {
		System.out.println(new backtracking().restoreIpAddresses("12345"));
	}
}
