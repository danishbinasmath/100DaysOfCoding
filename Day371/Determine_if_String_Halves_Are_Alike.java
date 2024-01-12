package Day371;

public class Determine_if_String_Halves_Are_Alike {
    class Solution {
        public boolean halvesAreAlike(String str) {
            int n = str.length();
            int counti = 0;
            int countj =0;
            int mid=str.length()/2;
            
            for(int i=0;i<mid;i++){
                if(isVowel(str.charAt(i))){
                    counti++;
                }
            }
            for(int i=mid;i<n;i++){
                if(isVowel(str.charAt(i))){
                    countj++;
                }
            }
            if(counti==countj){
                return true;
            }
            return false;
            
        }
        public boolean isVowel(char ch){
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'
                ||ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    return true;
                }
                return false;
        }
    }
}