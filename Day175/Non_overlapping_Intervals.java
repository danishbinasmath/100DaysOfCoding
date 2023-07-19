package Day175;

import java.util.Arrays;
import java.util.Comparator;

public class Non_overlapping_Intervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
            int ans = 0;
            int k = Integer.MIN_VALUE;

            for(int i = 0; i < intervals.length; i++) {
                int x = intervals[i][0];
                int y = intervals[i][1];

                if(x >= k) {
                    k = y;
                }else {
                    ans++;
                }
            }

            return ans;
        }
    }
}
