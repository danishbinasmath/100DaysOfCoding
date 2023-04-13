package Day78;

public class N_Repeated_Element_in_Size_2N_Array {
    class Solution {
        public int repeatedNTimes(int[] A) {
            Set<Integer> seen = new HashSet<>();
            for (int a : A) {
                if (!seen.add(a))
                    return a;
            }
            throw new IllegalArgumentException();
        }
    }
}
