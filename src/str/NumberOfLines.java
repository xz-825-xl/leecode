package str;

/**
 * Created by zy on 2019/9/8.
 * To be a happy coder!
 * 806. 写字符串需要的行数
 */
public class NumberOfLines {

    public static int[] numberOfLines(int[] widths, String S) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            int length = widths[S.charAt(i) - 97];
            if (sum + length > 100) {
                sum = length;
                count++;
            } else if (sum + length == 100) {
                count++;
                sum = 0;
            } else {
                sum += length;
            }
        }
        return new int[]{count, sum};
    }
}
