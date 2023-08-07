package Day194;

public class Search_a_2D_Matrix {
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = (m * n) - 1;

        while(low <= high) {
          int mid = (low + (high - low)/2);

          if(matrix[mid/m][mid%m] == target){
            return true;
          }
          if(matrix[mid/m][mid%m] > target) {
            high = mid - 1;
          }else {
            low = mid + 1;
          }
        }
      return false;
    }
  }
}
