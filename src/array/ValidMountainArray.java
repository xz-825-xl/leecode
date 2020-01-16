package array;

/**
 * 描述：941. 有效的山脉数组
 *
 * @author zy
 * @date 2020/1/16 9:09
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        Integer maxValue = null;
        for (int i = 1; i < A.length - 1; i++) {
            if (maxValue == null && A[i] > A[i - 1] && A[i] > A[i + 1]) {
                maxValue = A[i];
            } else if ((maxValue == null && A[i] <= A[i - 1]) || (maxValue != null && A[i + 1] >= A[i])) {
                return false;
            }
        }
        return maxValue != null;
    }

    public static boolean validMountainArray2(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < A.length - 1) {
            if (A[left] >= A[left + 1]) {
                break;
            }
            left++;
        }
        while (right > 0) {
            if (A[right] >= A[right - 1]) {
                break;
            }
            right--;
        }
        return left == right && left != 0 || left != A.length - 1;
    }
}
