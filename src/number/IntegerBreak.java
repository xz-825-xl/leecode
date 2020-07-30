package number;

/**
 * 描述：343. 整数拆分
 *
 * @author zy
 * @date 2020/7/30 8:58
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        int[] array = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int cur = 0;
            for (int j = 1; j < i; j++) {
                cur = Math.max(cur, Math.max(j * (i - j), j * array[i - j]));
            }
            array[i] = cur;
        }
        return array[n];
    }

}
