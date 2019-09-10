package array;

/**
 * 描述：598. 范围求和 II
 *
 * @author zy
 * @date 2019/9/10 8:34
 */
public class MaxCount {

    public static int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            m = Math.min(m, ops[i][0]);
            n = Math.min(n, ops[i][1]);
        }
        return m * n;
    }

}
