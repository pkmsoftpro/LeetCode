package subset_ii_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class recursive {

	Set<Integer> hash = new HashSet<>();
    List<List<Integer>> res = new ArrayList<>();
    int n;
    int[] nums;
    
    public void search(List<Integer> l, int p) {
        if (p == n) {
            int h = l.hashCode();
            if (!hash.contains(h)) {
                hash.add(h);
                res.add(new ArrayList<>(l));
            }
            return;
        }
        l.add(nums[p]);
        search(l, p+1);
        l.remove(l.size()-1);
        search(l, p+1);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.n = nums.length; this.nums = nums;
        Arrays.sort(nums);
        search(new ArrayList<Integer>(), 0);
        return res;
    }

	public static void main(String[] args) {
		int[] nums = {4,4,4,1,4};
		System.out.println(new recursive().subsetsWithDup(nums));
	}
}
