package Day267;

public class Find_the_Duplicate_Number {
    class Solution {
        public int findDuplicate(int[] arr) {
            int i = 0;
            while(i<arr.length){
                if(arr[i]!=i+1){
                int correct = arr[i] - 1;
                    if(arr[i]!=arr[correct]){
                        swap(arr,i,correct);
                    }else{
                        return arr[i];
                }}else{
                    i++;
                    }
                
            }
            return -1;
        }
        
        public void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
