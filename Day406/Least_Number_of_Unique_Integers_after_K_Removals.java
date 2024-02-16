import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Least_Number_of_Unique_Integers_after_K_Removals {
    class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int digit : arr) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> frequency = new ArrayList<>(map.entrySet());
        Collections.sort(frequency, (a,b) -> a.getValue() - b.getValue());

        int count = frequency.size();

        for(Map.Entry<Integer, Integer> entry : frequency) {
            int freq = entry.getValue();
            if(k >= freq) {
                k = k - freq;
                count--;
            }else {
                break;
            }
        }
        
        return count;
    }
}
}