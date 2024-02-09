package Day399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_Divisible_Subset {

    class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {
            int n = nums.length;
            if (n == 0)
                return new ArrayList<>();

            Arrays.sort(nums);

            int[] count = new int[n];
            int[] prev = new int[n];
            Arrays.fill(count, 1);
            Arrays.fill(prev, -1);

            int maxCount = 1, maxIndex = 0;

            for (int i = 1; i < n; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[i] % nums[j] == 0 && count[i] < count[j] + 1) {
                        count[i] = count[j] + 1;
                        prev[i] = j;
                    }
                }
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    maxIndex = i;
                }
            }

            List<Integer> result = new ArrayList<>();
            while (maxIndex != -1) {
                result.add(nums[maxIndex]);
                maxIndex = prev[maxIndex];
            }

            return result;
        }
    }

}