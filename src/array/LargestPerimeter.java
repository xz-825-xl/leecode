package array;

import java.util.Arrays;

/**
 * 描述：976. 三角形的最大周长
 *
 * @author zy
 * @date 2019/10/31 9:15
 */
public class LargestPerimeter {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }
}
