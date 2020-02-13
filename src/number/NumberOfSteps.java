package number;

/**
 * 描述：1342. 将数字变成 0 的操作次数
 *
 * @author zy
 * @date 2020/2/11 16:30
 */
public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num -= 1;
            } else {
                num >>= 1;
            }
            count++;
        }
        return count;
    }
}
