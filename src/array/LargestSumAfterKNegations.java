package array;

import java.util.Arrays;

/**
 * 描述：1005. K 次取反后最大化的数组和
 *
 * @author zy
 * @date 2019/11/22 8:30
 */
public class LargestSumAfterKNegations {
    public static int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (K > 0 && A[i] < 0) {
                sum -= A[i];
                A[i] = -A[i];
                K--;
            } else {
                sum += A[i];
            }
        }
        Arrays.sort(A);
        for (int i = 0; i < K; i++) {
            if (A[i] > 0) {
                return (K - i) % 2 == 0 ? sum : sum - 2 * A[i];
            } else {
                return sum;
            }
        }
        return sum;
    }
}
