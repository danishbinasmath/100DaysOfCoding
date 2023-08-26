package Day213;

import java.util.Arrays;

public class Maximum_Length_of_Pair_Chain {
    class Solution {
        public int findLongestChain(int[][] pairs) {
            // Sort pairs in ascending order based on the second element.
            Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
            int curr = Integer.MIN_VALUE;
            int ans = 0;

            for (int[] pair : pairs) {
                if (pair[0] > curr) {
                    ans++;
                    curr = pair[1];
                }
            }
            return ans;
        }
    }
}
