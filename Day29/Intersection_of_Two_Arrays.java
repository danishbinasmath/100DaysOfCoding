package Day29;


import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            //Step 1: Create HastSet
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> ans_Set = new HashSet<>();

            //Step 2: insert all the elements of nums1 in HashSet
            for(int a: nums1) {
                set.add(a);
            }

            //Step 3: Check if the values of nums2 contains in HastSet
            //        If it contains then add the nums2 value in ans_Set(i.e HashSet)
            //        And remove that value from the HashSet
            for(int b: nums2) {
                if(set.contains(b)) {
                    ans_Set.add(b);
                    set.remove(b);
                }
            }

            int[] ans = new int[ans_Set.size()];
            int i = 0;
            for(Integer c: ans_Set) {
                ans[i++] = c;
            }

            return ans;
        }
    }
}
