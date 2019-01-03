package validparentheses;

class Solution2 {
    public static boolean isValid(String s) {
       	char[] stack = new char[s.length()];
    	int head =0;
    	for(char c : s.toCharArray()){
    		switch(c){
    			case '(': stack[head++] = ')'; break;
    			case '{': stack[head++] = '}'; break;
    			case '[': stack[head++] = ']'; break;
    			default: if(head==0 || stack[--head] != c) return false; break;
    		}
    	}
    	return head==0;
	}
    
    public static void main(String[] args) {
		String str = "({[]}({{}}))";
		System.out.println(isValid(str));
	}
}
