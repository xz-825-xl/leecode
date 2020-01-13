package number;

/**
 * 描述：5307. 将整数转换为两个无零整数的和
 *
 * @author zy
 * @date 2020/1/13 9:15
 */
public class GetNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] rs = new int[2];
        for (int i = 1; i < n; i++) {
            if (isNoZero(i) && isNoZero(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return rs;
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
