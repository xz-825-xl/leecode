package number;

/**
 * @author Zhangying
 * @date 2019/8/21
 * leeCode 507 完美数
 */
public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        int sqr = (int) Math.sqrt(num);
        int sum = 0;
        for (int i = 1; i <= sqr; i++) {
            if (num % i == 0) {
                sum += (i == num ? 0 : i) + (num / i == num ? 0 : num / i);
            }
        }
        return sum == num;
    }

}
