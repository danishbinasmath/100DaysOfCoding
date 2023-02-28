package Day35;

public class Flipping_an_Image {
    //Method 1
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            for(int[] row: image){
                for(int i=0;i<(image[0].length+1)/2;i++){
                    int temp = row[i]^1;
                    row[i] = row[image[0].length-i-1]^1;
                    row[image[0].length-i-1] = temp;
                }
            }
            return image;
        }
    }


    //Method 2
    // class Solution {
    //     public int[][] flipAndInvertImage(int[][] image) {
    //         for(int[] row : image) {
    //             // reverse this array
    //             for (int i = 0; i < (image[0].length + 1) / 2; i++) {
    //                 // swap
    //                 int temp = row[i] ^ 1;
    //                 row[i] = row[image[0].length - i - 1] ^ 1;
    //                 row[image[0].length - i - 1] = temp;
    //             }
    //         }
    //         return image;
    //     }
    // }
}
