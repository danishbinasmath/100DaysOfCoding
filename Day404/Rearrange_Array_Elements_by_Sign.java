package Day404;
import java.util.*;

public class Rearrange_Array_Elements_by_Sign {
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            Queue<Integer> arr1 = new LinkedList<>();
            Queue<Integer> arr2 = new LinkedList<>();
    
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] < 0) {
                    arr1.add(nums[i]);
                }else {
                    arr2.add(nums[i]);
                }
            }
    
            int[] ans = new int[nums.length];
            for(int i = 0; i < ans.length; i++) {
                if(i % 2 == 0) {
                    ans[i] = arr2.remove();
                }else {
                    ans[i] = arr1.remove();
                }
            }
    
            return ans;
        }
    }
}