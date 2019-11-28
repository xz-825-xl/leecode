package array;

/**
 * 描述：944. 删列造序
 *
 * @author zy
 * @date 2019/11/28 8:48
 */
public class MinDeletionSize {
    public int minDeletionSize(String[] A) {
        int count = 0;
        char[][] chars = new char[A.length][A[0].length()];
        for (int i = 0; i < A.length; i++) {
            char[] temp = A[i].toCharArray();
            chars[i] = temp;
        }
        for (int i = 0; i < chars[0].length; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j][i] > chars[j + 1][i]) {
                    count++;
                    j = chars.length - 1;
                }
            }
        }
        return count;
    }
}
