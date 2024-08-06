// Merge Overlapping Intervals

// Given a list of intervals, merge them to get a list of non-overlapping intervals.
// intervali = [starti, endi]

// Example:
// Intervals: [[1, 2], [2, 3], [1, 4], [5, 6]]

// [1, 2] and [2, 3] can be merged to form [1, 3].
// Now, [1, 3] and [1, 4] can be merged to form [1, 4].
// [1, 4] and [5, 6] have no intersection.
// Hence above intervals are merged to form:
// [[1, 4], [5, 6]]

// Note that the final list should be in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingInterval {
    int[][] mergeIntervals(int[][] intervals) {
	    // add your logic here
		int n = intervals.length ;
		List<int[]> list = new ArrayList<>();
		Arrays.sort(intervals , (a,b) -> Integer.compare(a[0] , b[0]));
		int curr[] = intervals[0];
		 for(int i = 1 ; i < n ; i++){
			 int nextInterval[] = intervals[i];
			 if(curr[1] >= nextInterval[0]){
				 curr[1] = Math.max(curr[1] , nextInterval[1]);
			 }
			 else{
				 list.add(curr);
				 curr = nextInterval ;
			 }
		 }
		list.add(curr);
		int result[][] = new int[list.size()][2];
		for(int i = 0 ; i < list.size() ; i++){
			result[i] = list.get(i);
		}
		return result ;
		
	}
}
