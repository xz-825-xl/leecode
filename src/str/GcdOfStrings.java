package str;

/**
 * 描述：1071. 字符串的最大公因子
 *
 * @author zy
 * @date 2019/11/13 9:45
 */
public class GcdOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        String rs = str1.substring(0, gcd(str1.length(), str2.length()));
        return rs;
    }

    public static int gcd(int a, int b) {return b == 0 ? a : gcd(b , a % b);}
}
