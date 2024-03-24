package Day443;

public class Find_the_Duplicate_Number {
    class Solution {
        public static int findDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (!set.add(nums[i])) {
                    return nums[i];
                }
            }
    
            return len;
        }
    }
}