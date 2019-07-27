package number;

/**
 * Created by zy on 2019/7/21.
 * To be a happy coder!
 * leeCode 172
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int rs = 0;
        while (n > 0) {
            rs += n / 5;
            n = n / 5;
        }
        return rs;
    }
}
