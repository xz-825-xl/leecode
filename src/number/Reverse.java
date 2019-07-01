package number;

/**
 * @author Zhangying
 * @date 2019/7/1
 */
public class Reverse {

    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < -Integer.MAX_VALUE) {
            return 0;
        }
        long result;
        StringBuilder number = new StringBuilder();
        if (x < 0) {
            number.append(String.valueOf(-x).toCharArray());
            result = -Long.parseLong(number.reverse().toString());
        } else {
            number.append(String.valueOf(x).toCharArray());
            result = Long.parseLong(number.reverse().toString());
        }

        return result > Integer.MAX_VALUE || result < -Integer.MAX_VALUE ? 0 :(int) result;
    }
}
