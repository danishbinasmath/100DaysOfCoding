package Day88;

public class Array_Nesting {
    class Solution {
        public int arrayNesting(int[] A) {
            int res = 0, n = A.length;
            boolean[] seen = new boolean[n];
            for (int i : A) {
                int cnt = 0;
                while (!seen[i]) {
                    seen[i] = true;
                    cnt++;
                    i = A[i];
                }
                res = Math.max(res, cnt);
            }
            return res;
        }
    }
}
