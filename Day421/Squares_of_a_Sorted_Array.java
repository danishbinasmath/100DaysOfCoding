package Day421;

public class Squares_of_a_Sorted_Array {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            int i = 0, j = nums.length - 1;
            for(int k = nums.length - 1; k >= 0; k--) {
                if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                    result[k] = nums[i] * nums[i];
                    i++;
                }else {
                    result[k] = nums[j] * nums[j];
                    j--;
                }
            }
            return result;
        }
    }
}