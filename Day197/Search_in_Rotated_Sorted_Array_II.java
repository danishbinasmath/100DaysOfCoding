package Day197;

public class Search_in_Rotated_Sorted_Array_II {
    class Solution {
        public boolean search(int[] nums, int target) {
            if(nums.length == 0) {
                return false;
            }

            int low = 0;
            int high = nums.length - 1;

            while(low <= high) {
                int mid = (low + (high - low)/2);

                if(target == nums[mid]) {
                    return true;
                }

                if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                    low++;
                    high--;
                }else if(nums[low] <= nums[mid]) {
                    if(target >= nums[low] && target <= nums[mid]) {
                        high = mid - 1;
                    }else {
                        low = mid + 1;
                    }
                }else {
                    if(target >= nums[mid] && target <= nums[high]) {
                        low = mid + 1;
                    }else {
                        high = mid - 1;
                    }
                }
            }
            return false;
        }
    }
}
