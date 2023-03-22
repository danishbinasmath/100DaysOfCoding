package Day57;

public class Sort_Colors {
    class Solution {
        public void sortColors(int[] arr) {
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }
        }
        public void swap(int[] nums, int first , int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}
