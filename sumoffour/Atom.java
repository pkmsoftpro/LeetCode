package sumoffour;

import java.util.Set;

public class Atom {

	int sum;
	Set<Integer> list;
	public Atom(int sum, Set<Integer> indexes) {
		super();
		this.sum = sum;
		this.list = indexes;
	}
	public String toString(){
		return String.valueOf(sum)+list;
	}
}
