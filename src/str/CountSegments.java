package str;

/**
 * @author Zhangying
 * @date 2019/7/14
 */
public class CountSegments {

    public static int countSegments(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean flag = true;
        for (char c : s.toCharArray()) {
            if (c != ' ' && flag) {
                count++;
                flag = false;
            } else if (c == ' ') {
                flag = true;
            }
        }
        return count;
    }
}
