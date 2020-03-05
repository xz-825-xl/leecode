package number;

/**
 * 描述：365. 水壶问题
 * <p>
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 * <p>
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 * <p>
 * 你允许：
 * <p>
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 *
 * @author zy
 * @date 2020/3/4 15:26
 */
//todo:待弄明白
public class CanMeasureWater {

    public static boolean canMeasureWater(int x, int y, int z) {
        if (x == 0 && y == 0) {
            return z == 0;
        }
        return z == 0 || (z % gcd(x, y) == 0 && x + y >= z);
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        int r = x % y;
        return gcd(y, r);
    }

    public static boolean canMeasureWater2(int x, int y, int z) {
        if (x == 0 && y == 0) {
            return z == 0;
        }
        return z == 0 || (z % gcd(x, y) == 0 && x + y >= z);
    }

}
