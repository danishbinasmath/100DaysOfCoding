package Day103;

public class Matrix_Diagonal_Sum {
    class Solution {
        public int diagonalSum(int[][] mat) {

            int mid = mat.length / 2;

            int sum = 0;

            for(int i = 0; i < mat.length; i++) {

                //For Primary Diagonal
                sum = sum + mat[i][i];

                //FOr Secondary Diagonal
                sum = sum + mat[mat.length - 1 - i][i];

            }

            if(mat.length % 2 == 1) {
                sum = sum - mat[mid][mid];
            }

            return sum;

        }
    }
}
