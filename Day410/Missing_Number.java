package Day410;

public class Missing_Number {
    class Solution {
        public int missingNumber(int[] nums) {
           int n=nums.length,totalsum=n*(n+1)/2; //sum of first n natural numbers
           for(int i:nums)
               totalsum-=i;
           return totalsum;
       }
   }
}