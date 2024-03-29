package Day277;

public class Monotonic_Array {
    class Solution {
        public boolean isMonotonic(int[] A) {
            boolean inc = true, dec = true;
            for (int i = 1; i < A.length; ++i) {
                inc &= A[i - 1] <= A[i];
                dec &= A[i - 1] >= A[i];
            }
            return inc || dec;
        }
    }
}
