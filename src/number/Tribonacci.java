package number;

/**
 * 描述：1137. 第 N 个泰波那契数
 *
 * @author zy
 * @date 2019/11/21 9:42
 */
public class Tribonacci {

    public static int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b + c;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
