package array;

/**
 * 描述：896. 单调数列
 *
 * @author zy
 * @date 2019/10/29 16:33
 */
public class IsMonotonic {

    public static boolean isMonotonic(int[] A) {
        int diff = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (diff > 0 && A[i] - A[i + 1] > 0
                    || (diff < 0 && A[i] - A[i + 1] < 0)) {
                return false;
            }
            if (diff == 0) {
                diff = A[i + 1] - A[i];
            }
        }
        return true;
    }
}
