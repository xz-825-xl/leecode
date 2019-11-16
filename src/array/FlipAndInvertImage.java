package array;

/**
 * 描述：832. 翻转图像
 *
 * @author zy
 * @date 2019/11/16 12:46
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - 1 - j];
                A[i][A.length - 1 - j] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (A[i][j] ^ 1);
            }
        }
        return A;
    }
}
