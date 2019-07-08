package number;

/**
 * @author Zhangying
 * @date 2019/7/8
 * leeCode 38
 */
public class CountAndSay {

    public static String countAndSay(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(1);
        for (int i = 2; i <= n; i++) {
            String tmp = builder.toString();
            builder = new StringBuilder();
            int count = 0;
            char ch = tmp.toCharArray()[0];
            for (char c : tmp.toCharArray()) {
                if (c == ch) {
                    count++;
                } else {
                    builder.append(count);
                    builder.append(ch);
                    count = 1;
                    ch = c;
                }
            }
            builder.append(count);
            builder.append(ch);
        }
        return builder.toString();
    }
}
