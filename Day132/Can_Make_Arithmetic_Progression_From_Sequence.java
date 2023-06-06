package Day132;

import java.util.Arrays;

public class Can_Make_Arithmetic_Progression_From_Sequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            int minValue = Arrays.stream(arr).min().getAsInt();
            int maxValue = Arrays.stream(arr).max().getAsInt();
            int n = arr.length;
            if ((maxValue - minValue) % (n - 1) != 0) {
                return false;
            }

            int diff = (maxValue - minValue) / (n - 1);
            int i = 0;

            while (i < n) {
                // If arr[i] is at the correct index, move on.
                if (arr[i] == minValue + i * diff) {
                    i += 1;

                    // If arr[i] doesn't belong to this arithmetic sequence, return false.
                } else if ((arr[i] - minValue) % diff != 0) {
                    return false;

                    // Otherwise, find the index j to which arr[i] belongs, swap arr[j] with arr[i].
                } else {
                    int j = (arr[i] - minValue) / diff;

                    // If we find duplicated elements, return False.
                    if (arr[i] == arr[j]) {
                        return false;
                    }

                    // Swap arr[i] with arr[j].
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            return true;
        }
    }

}
