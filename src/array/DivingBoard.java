package array;

/**
 * 描述：面试题 16.11. 跳水板
 *
 * @author zy
 * @date 2020/7/8 9:39
 */
public class DivingBoard {

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] rs = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            rs[i] = (k - i) * shorter + i * longer;
        }
        return rs;
    }

}
