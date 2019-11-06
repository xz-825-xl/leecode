package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：888. 公平的糖果交换
 *
 * @author zy
 * @date 2019/11/6 9:35
 */
public class FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] rs = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            sum1 += A[i];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < B.length; i++) {
            sum2 += B[i];
            set.add(B[i]);
        }
        int diff = (sum1 - sum2) / 2;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i] - diff)) {
                return new int[]{A[i], A[i] - diff};
            }
        }
        return rs;
    }
}
