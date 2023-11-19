import java.util.Arrays;

public class Reduction_Operations_to_Make_the_Array_Elements_Equal {
    class Solution {
        public int reductionOperations(int[] nums) {
            Arrays.sort(nums);
            int ans = 0;
            int up = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    up++;
                }

                ans += up;
            }

            return ans;
        }
    }
}
