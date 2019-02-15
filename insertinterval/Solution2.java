package insertinterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval {int start;int end;Interval(){start = 0;end = 0;}Interval(int s, int e){start = s;end=e;} public String toString(){return "" + start + " "+end;}}

public class Solution2 {

	public List<Interval> insert(List<Interval> intervals, final Interval newInterval) {
		if(intervals.isEmpty()) return new ArrayList<Interval>(){{add(newInterval);}};
		Interval startInterval = null, endInterval = null;
		Collections.sort(intervals,new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		Queue<Interval> heap = new PriorityQueue<>(new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start-o2.start;
			}
		});
		heap.addAll(intervals);
		for(Interval i : heap){
			if(newInterval.start<=i.start){
				startInterval = i;
				break;
			}
		}
		for(Interval i : heap){
			if(newInterval.end<=i.start || newInterval.end<=i.end){
				endInterval = i;
				break;
			}
		}
		Interval mergerInterval = null;
		if(startInterval==null) mergerInterval = endInterval;
		else if(endInterval==null) mergerInterval = startInterval;
		else {
			mergerInterval	= new Interval(
					newInterval.start<startInterval.start?
					newInterval.start:startInterval.start,
					newInterval.end>endInterval.end?
					newInterval.end:endInterval.end);
		}
		if(mergerInterval == null) intervals.add(newInterval);
		else {

			for(int i=1;i<intervals.size();){
				if(intervals.get(i).end<=mergerInterval.end){
					Interval change = new Interval(intervals.get(i-1).start,mergerInterval.end);
					intervals.set(i-1, change);
					intervals.remove(i);
				} else i++;
			}
		}
		return intervals;
	}
	
	public static void main(String[] args) {
		List<Interval> lists = new ArrayList<Interval>();
		/*lists.add(new Interval(1,2));lists.add(new Interval(3,5));lists.add(new Interval(6,7));
		lists.add(new Interval(8,10));lists.add(new Interval(12,16));*/
		/*lists.add(new Interval(1,3));lists.add(new Interval(6,9));*/
		/*lists.add(new Interval(1,5));*/
		lists.add(new Interval(2,6));lists.add(new Interval(7,9));
		/*System.out.println(new Solution2().insert(lists, new Interval(2,5)));*/
		/*System.out.println(new Solution2().insert(lists, new Interval(2,3)));*/
		System.out.println(new Solution2().insert(lists, new Interval(15,18)));
	}
}
