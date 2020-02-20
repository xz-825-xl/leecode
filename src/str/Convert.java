package str;

/**
 * 描述：6. Z 字形变换
 *
 * @author zy
 * @date 2020/2/20 14:07
 */
public class Convert {
    public static String convert(String s, int numRows) {
        StringBuilder rs = new StringBuilder();
        if(numRows == 1)
            return s;
        char[] chars = s.toCharArray();
        int span = 2 * numRows - 2;
        int len = s.length();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < len; j += span) {
                rs.append(chars[j]);
                if (i != 0 && i != numRows - 1 && j + span - 2 * i < len) {
                    rs.append(chars[j + span - 2 * i]);
                }
            }
        }
        return rs.toString();
    }
}
