package str;

/**
 * 描述：459. 重复的子字符串
 *
 * @author Zhangying
 * @date 2020/8/24 9:13
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0) {
                boolean flag = true;
                for (int j = n / i; j > 0; j--) {
                    if (!s.substring(0, i).equals(
                            s.substring(i * (j - 1), i * j))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
