public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            
            int[] ans = {-1,1};
            int start = search(nums, target, true);
            int end = search(nums, target, false);
            
            ans[0] = start;
            ans[1] = end;
            
            return ans;
            
        }

        int search(int[] nums, int target, boolean findnum){
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            
            while(start<=end){
                int mid = start + (end-start)/2;
                
                if(target<nums[mid]){
                    end = mid - 1;
                }else if(target>nums[mid]){
                    start = mid + 1;
                }else{
                    ans = mid;
                    if(findnum){
                        end =  mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
            }
            return ans;
            
        }
    }

    

}
