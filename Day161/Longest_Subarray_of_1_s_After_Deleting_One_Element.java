package Day161;

public class Longest_Subarray_of_1_s_After_Deleting_One_Element {
    class Solution {
        public int longestSubarray(int[] A) {
            int i = 0, j, k = 1;
            for (j = 0; j < A.length; ++j) {
                if (A[j] == 0) k--;
                if (k < 0 && A[i++] == 0) k++;
            }
            return j - i - 1;
        }
    }
}
