package Day72;

public class Sort_Array_By_Parity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            //using two pointer method so that no need to take extra space(inplace algorithm using two method)

            int i = 0;
            int j = nums.length - 1;

            while(i < j) {
                if(nums[i]%2 > nums[j]%2) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                if(nums[i] % 2 == 0) i++;
                if(nums[j] % 2 == 1) j--;
            }

            return nums;
        }
    }
}
