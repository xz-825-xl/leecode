package bit;

/**
 * @author Zhangying
 * @date 2019/8/13
 * leeCode 191
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int rs = 0;
        for (int i = 0; i < 32; i++) {
            rs += n & 1;
            n = n >> 1;
        }
        return rs;
    }

}
