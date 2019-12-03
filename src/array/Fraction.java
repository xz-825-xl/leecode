package array;

/**
 * 描述：LCP 2. 分式化简
 *
 * @author zy
 * @date 2019/12/3 8:45
 */
public class Fraction {
    public int[] fraction(int[] cont) {
        int[] rs = new int[2];
        rs[0] = 1;
        rs[1] = 0;
        for (int i = cont.length - 1; i >= 0; i--) {
            int temp = rs[1];
            rs[1] = rs[0];
            rs[0] = cont[i] * rs[1] + temp;
        }
        return rs;
    }
}
