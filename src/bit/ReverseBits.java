package bit;

/**
 * @author Zhangying
 * @date 2019/8/12
 * leeCode 190
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int rs = 0;
        for (int i = 0; i < 32; i++) {
           rs |= (1 & (n >> i)) << (31 - i);
        }
        return rs;
    }
}
