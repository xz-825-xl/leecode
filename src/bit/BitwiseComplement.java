package bit;

/**
 * 描述：1009. 十进制整数的反码
 *
 * @author zy
 * @date 2019/9/25 8:35
 */
public class BitwiseComplement {

    public static int bitwiseComplement(int N) {
        int count = 0;
        int temp = N;
        while (N > 0) {
            count = (count << 1) + 1;
            N >>= 1;
        }
        return temp == 0 ? 1 : (count ^ temp);
    }

}
