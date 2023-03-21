package Day56;

public class Number_of_Zero_Filled_Subarrays {
    class Solution {
        public long zeroFilledSubarray(int[] nums) {
            long ans = 0;
            for(int i = 0 ; i < nums.length ; i++){
//             We want to mark the beginning and ending of zeroes to see how many zeroes are present in the subarray.
                if(nums[i] == 0){
                    long count = 0;
                    while(i < nums.length && nums[i] == 0){
                        count++;
                        i++;
                    }
//                 If we observe carefully, if there is 1 zero then 1 subarray is there
//                 If 2 , then 1+2 = 3  1  ->  one 2 element array and two 1 element array.
//                 If 3 , then 3+2+1 = 6   -> one 3 element array, two 2 element array and  three 1 element array.
//                 We will observe this pattern as we move ahead. So we will use sum of n natural numbers formula
//                 which is sum = (n(n+1))/2
                    ans += ((count)*(count +1))/2;
                }
            }
            return ans;
        }

    }
}
