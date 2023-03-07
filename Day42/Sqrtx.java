package Day42;

public class Sqrtx {
    class Solution {
        public int mySqrt(int x) {
            if (x == 0) return 0;
            int start = 1, end = x;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
                    return mid;
                else if (mid > x / mid)// Keep checking the left part
                    end = mid;
                else
                    start = mid + 1;// Keep checking the right part
            }
            return start;
        }
    }

    //A little trick is using i <= x / i for comparison, instead of i * i <= x, to avoid exceeding integer upper limit.

    // Solution2 - Newton Solution: Time complexity = O(lg(x))

    // I think Newton solution will not be faster than Solution1(Binary Search), because i = (i + x / i) / 2, the two factors i and x / i are with opposite trends. So time complexity in the best case is O(lgx).

    // Anyone can give the accurate time complexity? Appreciate it!

    // public int mySqrt(int x) {
    //     if (x == 0) return 0;
    // 	long i = x;
    // 	while(i > x / i)
    // 		i = (i + x / i) / 2;
    // 	return (int)i;
    // }
    // Solution3 - Brute Force: Time complexity = O(sqrt(x))

    // public int mySqrt(int x) {
    // 	if (x == 0) return 0;
    // 	for (int i = 1; i <= x / i; i++)
    // 		if (i <= x / i && (i + 1) > x / (i + 1))// Look for the critical point: i*i <= x && (i+1)(i+1) > x
    // 			return i;
    // 	return -1;
    // }
}
