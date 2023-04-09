package Day74;

public class Rotate_Image {
    class Solution {
        public void rotate(int[][] matrix) {

            //transpose the 2d matrix using swap
            for(int i = 0; i<matrix.length;i++) {
                for(int j=i; j<matrix[0].length;j++) {
                    int temp = 1;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            //just every row of the matrix
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix.length/2; j++) {
                    int temp = 1;
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length-1-j];
                    matrix[i][matrix.length-1-j] = temp;
                }
            }
        }
    }
}
