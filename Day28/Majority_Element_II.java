package Day28;
import java.util.*;

public class Majority_Element_II {
    //Method 1: HashMap
    class Solution1 {
        public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            //add the number's in key and add the frequency(i.e repetition) of number in value of HashMap.
            //Increase the frequency if they same key value is found.
            for(int ele: nums) {
                if(map.containsKey(ele)) {
                    map.put(ele, map.get(ele) + 1);
                }else {
                    map.put(ele, 1);
                }
            }

            List<Integer> ans = new ArrayList<>();

            //check if the value of key is greater than ((size of array) / 3), if it is then add in List.
            for(int key: map.keySet()) {
                if(map.get(key) > (nums.length/3)) {
                    ans.add(key);
                }
            }

            return ans;
        }
    }


    //Method 2: Boyer-Moore Majority Voting Algorithm
    class Solution2
    {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> ans = new ArrayList<>();

            int candidate1 = 0;
            int candidate2 = 1;
            int CountSoFar1 = 0;
            int CountSoFar2 = 0;

            for(int num: nums) {
                if(num == candidate1){
                    CountSoFar1++;
                }else if(num == candidate2){
                    CountSoFar2++;
                }else if(CountSoFar1 == 0){
                    candidate1 = num;
                    CountSoFar1++;
                }else if(CountSoFar2 == 0){
                    candidate2 = num;
                    CountSoFar2++;
                }else {
                    CountSoFar1--;
                    CountSoFar2--;
                }
            }

            int count1 = 0;
            int count2 = 0;

            for(int num: nums){
                if(num == candidate1) count1++;
                else if(num == candidate2) count2++;
            }

            if(count1 > nums.length/3) ans.add(candidate1);
            if(count2 > nums.length/3) ans.add(candidate2);

            return ans;

        }
    }
}
