package array;

/**
 * 描述：378. 有序矩阵中第K小的元素
 *
 * @author zy
 * @date 2020/7/2 9:12
 */
public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left < right) {
            int mid = (right + left) / 2;
            if(check(matrix, k, mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean check(int[][] matrix, int k, int mid) {
        int count = 0;
        int n = matrix.length - 1;
        int m = 0;
        while (n >= 0 && m < matrix.length) {
            if (matrix[n][m] <= mid) {
                count += n + 1;
                m++;
            } else {
                n--;
            }
        }
        return count >= k;
    }

    public static void main(String[] args) {
        kthSmallest(new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        }, 8);
    }

}
