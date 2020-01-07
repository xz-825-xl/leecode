package array;

/**
 * 描述：1304. 和为零的N个唯一整数
 *
 * @author zy
 * @date 2020/1/6 8:56
 */
public class SumZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int num = (n & 1) == 0 ? 1 : 0;
        for (int i = 0; i < n; i++) {
            result[i] = num;
            num = 0 - num;
            if (num >= 0) {
                num++;
            }
        }
        return result;
    }
}
