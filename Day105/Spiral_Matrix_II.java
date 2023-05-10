package Day105;

public class Spiral_Matrix_II {
    class Solution {
        public int[][] generateMatrix(int n) {

            int[][] result = new int[n][n];

            int top = 0;
            int bottom = result.length - 1;
            int left = 0;
            int right = result[0].length - 1;

            int count = 1;

            while(true) {
                for(int i = left; i <= right; i++) result[top][i] = count++;
                top++;
                if(left > right || top > bottom) break;

                for(int i = top; i <= bottom; i++) result[i][right] = count++;
                right--;
                if(left > right || top > bottom) break;

                for(int i = right; i >= left; i--) result[bottom][i] = count++;
                bottom--;
                if(left > right || top > bottom) break;

                for(int i = bottom; i >= top; i--) result[i][left] = count++;
                left++;
                if(left > right || top > bottom);
            }

            return result;

        }
    }
}
