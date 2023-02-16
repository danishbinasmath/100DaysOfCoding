package Day23;

public class Majority_Element {

    //Method 1: using Boyer-Moore Voting Algorithm
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count = count + ((num == candidate) ? 1 : -1);
            }

            return candidate;
        }
    }

// Method 2: using sorting
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }

}
