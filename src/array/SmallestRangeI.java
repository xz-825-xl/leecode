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

}
