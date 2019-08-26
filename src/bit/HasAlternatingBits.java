package bit;

/**
 * Created by Mmn on 2019/8/26.
 * To be a happy coder!
 * leeCode 693. 交替位二进制数
 */
public class HasAlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        int temp;
        while (n > 0) {
            temp = n & 1;
            n >>= 1;
            if (temp == (n & 1)) {
                return false;
            }
        }
        return true;
    }
}
