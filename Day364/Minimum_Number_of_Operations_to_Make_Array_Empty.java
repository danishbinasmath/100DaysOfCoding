package Day364;

import java.util.HashMap;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {
    class Solution {
    public int minOperations(int[] nums) {
        var counter = new HashMap<Integer, Integer>();
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int c: counter.values()) {
            if (c == 1) {
                return -1;
            }
            ans += Math.ceil((double) c / 3);
        }
        return ans;
    }
}
}