package insertinterval;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> result = new ArrayList<Interval>();
		int i=0;
		while(i<intervals.size() && intervals.get(i).end<newInterval.start)
			result.add(intervals.get(i++));
		while(i<intervals.size() && newInterval.end>=intervals.get(i).start){
			newInterval = new Interval(
					Math.min(intervals.get(i).start, newInterval.start),
					Math.max(intervals.get(i).end, newInterval.end));
			i++;
		}
		result.add(newInterval);
		while(i<intervals.size()) result.add(intervals.get(i++));
		return result;
	}
	
	public static void main(String[] args) {
		List<Interval> lists = new ArrayList<Interval>();
		lists.add(new Interval(1,2));lists.add(new Interval(3,5));lists.add(new Interval(6,7));
		lists.add(new Interval(8,10));lists.add(new Interval(12,16));
		/*lists.add(new Interval(1,3));lists.add(new Interval(6,9));*/
		/*lists.add(new Interval(1,5));*/
		/*lists.add(new Interval(2,6));lists.add(new Interval(7,9));*/
		System.out.println(new Solution().insert(lists, new Interval(5,8)));
		/*System.out.println(new Solution2().insert(lists, new Interval(2,3)));*/
		/*System.out.println(new Solution2().insert(lists, new Interval(15,18)));*/
	}
}
