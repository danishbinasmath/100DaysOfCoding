package Day428;

import java.util.HashSet;

public class Minimum_Common_Value {
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            int ans = Integer.MAX_VALUE;
            HashSet<Integer> set = new HashSet<>();

            for (int num : nums1) {
                set.add(num);
            }

            for (int num : nums2) {
                if (set.contains(num)) {
                    ans = Math.min(num, ans);
                }
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}