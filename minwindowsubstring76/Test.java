package minwindowsubstring76;

public class Test {
	
	public String minWindow(String s, String t) {
		int slen = s.length();
		int plen = t.length();
		if(slen<plen) return "";
		int[] smap = new int[128];
		int[] pmap = new int[128];
		
		for(int i=0;i<plen;i++){
			pmap[t.charAt(i)]++;
		}
		int start =0, count =0, start_index=-1, min_len = Integer.MAX_VALUE;
		for(int i=0;i<slen;i++){
			smap[s.charAt(i)]++;
			
			if(smap[s.charAt(i)]<=pmap[s.charAt(i)]){
				count++;
			}
			if(count==plen){
				while(smap[s.charAt(start)]>pmap[s.charAt(start)]){
					smap[s.charAt(start)]--;
					start++;
				}

				if(min_len>(i-start)){
					min_len= i-start+1;
					start_index = start;
				}
			}
		}
		if(start_index==-1) return "";
		return s.substring(start_index,start_index+min_len);
	}

	public static void main(String[] args) {
		String S = "a", T = "b";
		System.out.println(new Test().minWindow(S, T));
	}
}
