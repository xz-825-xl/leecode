package str;

/**
 * @author Zhangying
 * @date 2019/7/17
 * leeCode 541
 */
public class ReversStr {

    /**
     * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
     * 如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，
     * 并将剩余的字符保持原样
     *
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        String temp = s;
        StringBuilder builder = new StringBuilder();
        while (temp.length() > 0) {
            if (temp.length() < k) {
                builder.append(revers(temp));
                temp = "";
            } else if (temp.length() >= k && temp.length() <= 2 * k) {
                builder.append(revers(temp.substring(0, k)));
                builder.append(temp.substring(k));
                temp = "";
            } else {
                builder.append(revers(temp.substring(0, k)));
                builder.append(temp.substring(k, 2 * k));
                temp = temp.substring(2 * k);
            }
        }
        return builder.toString();
    }

    private String revers(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
