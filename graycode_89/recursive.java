package graycode_89;

import java.util.ArrayList;
import java.util.List;

public class recursive {

	public List<Integer> grayCode(int n) {
	    List<Integer> result = new ArrayList<Integer>();
	    if(n < 0){ return result;}
	    if(n == 0){
	        result.add(0);
	        return result;
	    }
	    result = grayCode(n-1);
	    int increment = (int) Math.pow(2, n-1);
	    for(int i = result.size() - 1; i >= 0; i--){
	        result.add(result.get(i) + increment);
	    }
	    return result;
	}

	public static void main(String[] args) {
		System.out.println(new recursive().grayCode(3));
	}
}
