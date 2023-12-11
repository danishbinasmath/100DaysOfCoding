
public class Element_Appearing_More_Than_25percentage_In_Sorted_Array {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, t = n / 4;

        for (int i = 0; i < n - t; i++) {
            if (arr[i] == arr[i + t]) {
                return arr[i];
            }
        }
        return -1;
    }
}