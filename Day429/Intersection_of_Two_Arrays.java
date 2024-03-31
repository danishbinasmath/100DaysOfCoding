import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>();
            for(int num : nums1) {
                set1.add(num);
            }
    
            HashSet<Integer> set2 = new HashSet<>();
            for(int num : nums2) {
                if(set1.contains(num)) {
                    set2.add(num);
                }
            }
    
            int[] ans = new int[set2.size()];
            int i = 0;
            for(int num : set2) {
                ans[i++] = num;
            }
    
            return ans;
        }
    }
}
