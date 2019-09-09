package bit;

/**
 * Created by zy on 2019/9/7.
 * To be a happy coder!
 * 868. 二进制间距
 */
public class BinaryGap {
    public static int binaryGap(int N) {
        int count = 0;
        boolean tag = false;
        int index = 0;
        while (N > 0) {
            if ((N & 1) == 1) {
                if (tag) {
                    index++;
                    count = Math.max(count, index);
                    index = 0;
                } else {
                    tag = true;
                }
            } else if (tag) {
                index++;
            }
            N >>= 1;
        }
        return count;
    }
}
