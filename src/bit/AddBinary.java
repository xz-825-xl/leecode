package bit;

/**
 * 描述：67. 二进制求和
 *
 * @author zy
 * @date 2020/6/23 15:12
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int inc = 0;
        StringBuilder builder = new StringBuilder();
        while (aIndex >= 0 || bIndex >= 0) {
            int rs = 0;
            if (aIndex >= 0 && bIndex >= 0) {
                rs = (a.charAt(aIndex) - '0') + (b.charAt(bIndex) - '0');
            } else if (aIndex >= 0) {
                rs = a.charAt(aIndex) - '0';
            } else if (bIndex >= 0) {
                rs = b.charAt(bIndex) - '0';
            }
            rs += inc;
            if (rs >= 2) {
                builder.append(rs % 2);
                inc = 1;
            } else {
                builder.append(rs);
                inc = 0;
            }
            aIndex--;
            bIndex--;
        }
        if (inc > 0) {
            builder.append(inc);
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }
}
