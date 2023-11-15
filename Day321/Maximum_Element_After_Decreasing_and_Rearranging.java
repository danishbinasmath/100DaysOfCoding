import java.util.Arrays;

public class Maximum_Element_After_Decreasing_and_Rearranging {
    class Solution {
        public int maximumElementAfterDecrementingAndRearranging(int[] A) {
            Arrays.sort(A);
            int pre = 0;
            for (int a : A)
                pre = Math.min(pre + 1, a);
            return pre;
        }
    }
}
