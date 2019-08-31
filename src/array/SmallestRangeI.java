package array;

import java.util.Arrays;

/**
 * Created by Mmn on 2019/8/31.
 * To be a happy coder!
 * 908. 最小差值 I
 */
public class SmallestRangeI {

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int dis = A[A.length - 1] - A[0];
        return dis > 2 * K ? dis - 2 * K : 0;
    }

    public int smallestRangeI2(int[] A, int K) {
        if (A.length == 0) {
            return 0;
        }
        int max = A[0];
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        return Math.max((max - min) - 2 * K, 0);
    }
}
