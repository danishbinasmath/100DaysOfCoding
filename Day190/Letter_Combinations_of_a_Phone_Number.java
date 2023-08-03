package Day190;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if(digits == null || digits.length() == 0) return ans;
            ans = Nokia("", digits);
            return ans;
        }

        // public List<String> Nokia(String p, String up) {
        //     if(up.isEmpty()) {
        //         List<String> list = new ArrayList<>();
        //         list.add(p);
        //         return list;
        //     }

        //     int digits = up.charAt(0) - '1';

        //     List<String> list = new ArrayList<>();

        //     for(int i = (digits-1)*3; i < digits*3; i++) {
        //         char ch = (char) ('a' + i);
        //         list.addAll(Nokia(p+ch, up.substring(1)));
        //     }

        //     return list;

        // }

        public static List<String> Nokia(String ans, String ip) {

            if(ip.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(ans);
                return list;
            }

            int digit = ip.charAt(0) - '0';
            int i=(digit-2)*3;
            if(digit > 7) {
                i+=1;
            }
            int len = i+3;
            if(digit == 7 || digit == 9) {
                len+=1;
            }

            ArrayList<String> list = new ArrayList<>();

            for(; i<len; i++) {
                char ch = (char)('a' + i);
                list.addAll(Nokia(ans+ch, ip.substring(1)));
            }

            return list;

        }


    }
}
