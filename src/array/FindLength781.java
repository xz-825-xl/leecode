package array;

/**
 * 描述：718. 最长重复子数组
 *
 * @author zy
 * @date 2020/7/1 8:54
 */
public class FindLength781 {

    public static int findLength(int[] A, int[] B) {
        int maxCount = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    maxCount = Math.max(maxCount, getLength(A, B, i, j));
                }
            }
        }
        return maxCount;
    }

    private static int getLength(int[] A, int[] B, int Ai, int Bi) {
        int count = 0;
        while (Ai < A.length && Bi < B.length) {
            if (A[Ai] == B[Bi]) {
                count++;
            } else {
                return count;
            }
            Ai++;
            Bi++;
        }
        return count;
    }

    public static int findLength2(int[] A, int[] B) {
        int maxCount = 0;
        int m = A.length, n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    maxCount = Math.max(maxCount, dp[i][j]);
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
        findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0});
    }
}
