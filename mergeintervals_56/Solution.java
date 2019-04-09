/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 
 https://leetcode.com/problems/merge-intervals/discuss/219817/Simple-Java-In-place-solution-really-nice-haha
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null)
            return null;
        intervals.sort(new Comparator<Interval>(){
            public int compare(Interval v1, Interval v2){
                return v1.start - v2.start;
            }
        });
        for(int i=0; i< intervals.size()-1; i++){           
            if(intervals.get(i).end >= intervals.get(i+1).start){             
                if(intervals.get(i).end < intervals.get(i+1).end){
                     intervals.get(i).end = intervals.get(i+1).end;
                }
                intervals.remove(i+1);
                i--;
            }
        }
        return intervals;
    }
}
