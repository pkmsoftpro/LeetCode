package nqueen;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println(new Test().generateNqueen(4));
	}

	private List<List<Integer>> generateNqueen(int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<Integer>(), n, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int n, int row) {
		if(row==n) {
			list.add(new ArrayList<Integer>(tempList));
		} else {
			for(int i=0;i<n;i++) {
				tempList.add(i);
				if(isValid(tempList)) {
					backtrack(list, tempList, n, row+1);
				}
				tempList.remove(tempList.size()-1);
			}
		}
	}

	private boolean isValid(ArrayList<Integer> tempList) {
		int curr = tempList.size()-1;
		for(int i=0;i<curr;i++) {
			int absVal = Math.abs(tempList.get(curr)-tempList.get(i));
			if(absVal==0 || (curr-i)==absVal) return false;
		}
		return true;
	}
}
