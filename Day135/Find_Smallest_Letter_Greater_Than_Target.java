package Day135;

public class Find_Smallest_Letter_Greater_Than_Target {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;

            while(start<=end){
                int mid = start + (end - start)/2;

                // if(target==letters[mid]){
                //     return letters[mid];
                // }

                if(target<letters[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }

            }return letters[start % letters.length];

        }
    }
}
