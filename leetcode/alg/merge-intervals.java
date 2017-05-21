/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18]. 
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1)
            return intervals;
        List<Interval> result = new ArrayList<Interval>();
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval a,Interval b){
                return Integer.compare(a.start,b.start);
            }    
        });
        Interval temp = new Interval();
        for(int i=0;i<intervals.size();){
            temp = intervals.get(i);
            int j = 0;
            for(j=i+1;j<intervals.size();j++){
                if(temp.end>=intervals.get(j).start) 
                    temp.end = (int)Math.max(temp.end,intervals.get(j).end);
                else
                    break;
            }
            result.add(temp);
            i = j;
        }
        return result;
    }
}
