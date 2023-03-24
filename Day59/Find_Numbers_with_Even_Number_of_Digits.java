package Day59;

public class Find_Numbers_with_Even_Number_of_Digits {
    class Solution {

        public int findNumbers(int[] nums) {
            int count = 0;

            for(int num : nums) {
                if(even(num)){
                    count++;
                }
            }

            return count;
        }

        boolean even(int num){
            int countednumber = digit(num);
            return (countednumber%2==0);
        }

        int digit(int num){
            // if(num<0){
            //     num = num*-1;
            // }
            return (int)(Math.log10(num) + 1);
        }

    }
}
