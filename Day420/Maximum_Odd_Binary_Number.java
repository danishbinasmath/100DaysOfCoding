package Day420;

public class Maximum_Odd_Binary_Number {
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            // Create char array
            char[] arr = s.toCharArray();
            int N = arr.length;
            
            // Initialize two pointers
            int left = 0;
            int right = N - 1;
    
            while (left <= right) {
                
                // Increment left if equals 1
                if (arr[left] == '1') {
                    left++;
                }
                // Decrement right if equals 0
                if (arr[right] == '0') {
                    right--;
                }
                // Swap if neither pointer can be iterated
                if (left <= right && arr[left] == '0' && arr[right] == '1') {
                    arr[left] = '1';
                    arr[right] = '0';
                }
            }
    
            // Swap rightmost 1 bit to the end
            arr[left - 1] = '0';
            arr[N - 1] = '1';
    
            return new String(arr);
        }
    }
}