package number;

/**
 * 描述：788. 旋转数字
 *
 * @author zy
 * @date 2019/9/18 8:37
 */
public class RotatedDigits {

    public static int rotatedDigits(int N) {
        int[] ins = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            int temp = i;
            while (temp > 0) {
                int n = temp % 10;
                if (ins[n] < 0) {
                    flag = 0;
                    break;
                } else {
                    flag += ins[n];
                }
                temp /= 10;
            }
            if (flag > 0) {
                count++;
            }
        }
        return count;
    }

}
