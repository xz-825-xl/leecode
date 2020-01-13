package bit;

/**
 * 描述：5308. 或运算的最小翻转次数
 *
 * @author zy
 * @date 2020/1/13 9:21
 */
public class MinFlips {

    public int minFlips(int a, int b, int c) {
        int count = 0;
        while (c > 0 || a > 0 || b > 0) {
            int tempC = c & 1;
            int tempA = a & 1;
            int tempB = b & 1;
            if (tempC != (tempA | tempB)) {
                if (tempC == 0) {
                    count += (tempA == tempB ? 2 : 1);
                } else {
                    count += 1;
                }
            }
            c = c >> 1;
            a = a >> 1;
            b = b >> 1;
        }
        return count;
    }
}
