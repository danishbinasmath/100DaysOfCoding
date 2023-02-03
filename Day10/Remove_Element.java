package Day10;

public class Remove_Element {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int ans = 0;
            for(int i=0; i<nums.length; i++) {
                if(nums[i] != val) {
                    nums[ans] = nums[i];
                    ans++;
                }
            }
            return ans;
        }
    }
}
