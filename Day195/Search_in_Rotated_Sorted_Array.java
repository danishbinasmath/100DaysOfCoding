package Day195;

public class Search_in_Rotated_Sorted_Array {
    class Solution {
        public int search(int[] nums, int target) {
            if (nums.length == 0) {
                return -1;
            }

            int high = nums.length - 1;
            int low = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (target == nums[mid]) {
                    return mid;
                }

                if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                    low++;
                    high--;
                } else if (nums[low] <= nums[mid]) {
                    if (target >= nums[low] && target <= nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (target >= nums[mid] && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            return -1;
        }
    }
}
