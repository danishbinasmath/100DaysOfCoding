package Day432;

public class Find_the_Pivot_Integer {
    class Solution {
        public int pivotInteger(int n) {
            if(n == 1) return n;
    
            int leftValue = 1;
            int rightValue = n;
            int leftSum = leftValue;
            int rightSum = rightValue;
    
            while(leftValue < rightValue) {
                if(leftSum < rightSum) {
                    leftSum = leftSum + (++leftValue);
                }else {
                    rightSum = rightSum + (--rightValue);
                }
    
                if(leftSum == rightSum && leftValue + 1 == rightValue - 1) {
                    return leftValue + 1;
                }
            }
    
            return -1;
        }
    }
}