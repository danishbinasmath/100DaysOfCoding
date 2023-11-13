import java.util.Arrays;
import java.util.Comparator;

public class Sort_Integers_by_The_Number_of_1_Bits {
    class Solution {
        public int[] sortByBits(int[] arr) {
            Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Comparator<Integer> comparator = new CustomComparator();
            Arrays.sort(nums, comparator);
            return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
        }
    }
    
    class CustomComparator implements Comparator<Integer> {
        private int findWeight(int num) {
            int mask = 1;
            int weight = 0;
            
            while (num > 0) {
                if ((num & mask) > 0) {
                    weight++;
                    num ^= mask;
                }
                
                mask <<= 1;
            }
            
            return weight;
        }
        
        @Override
        public int compare(Integer a, Integer b) {
            if (findWeight(a) == findWeight(b)) {
                return a - b;
            }
            
            return findWeight(a) - findWeight(b);
        }
    }
}
