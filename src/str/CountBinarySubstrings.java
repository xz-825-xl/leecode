package str;

/**
 * Created by Mmn on 2019/8/25.
 * To be a happy coder!
 * leeCode 696. 计数二进制子串
 */
public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int count = 0;
        int c0 = 0;
        int c1 = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (flag) {
                    c0 = 0;
                    flag = false;
                }
                c0++;
                if (c0 <= c1) {
                    count++;
                }
            } else {
                if (!flag) {
                    c1 = 0;
                    flag = true;
                }
                c1++;
                if (c1 <= c0) {
                    count++;
                }
            }
        }
        return count;
    }

}
