package Day32;

public class Search_in_Rotated_Sorted_Array {
    class Solution {
        public int search(int[] nums, int target) {
            return RecursiveRBS(nums,target,0,nums.length-1);
        }

        public int RecursiveRBS(int[] arr, int target, int start, int end){
            if(start>end){
                return -1;
            }
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            //condition 1
            if(arr[start]<=arr[mid]){
                if(target>=arr[start]&&target<=arr[mid]){
                    return RecursiveRBS(arr,target,start,mid-1);
                }else{
                    return RecursiveRBS(arr,target,mid+1,end);
                }
            }
            //condition 2
            if((target>=arr[mid]&&target<=arr[end])){
                return RecursiveRBS(arr,target,mid+1,end);
            }
            //condition 3
            return RecursiveRBS(arr,target,start,mid-1);

        }

    }
}
