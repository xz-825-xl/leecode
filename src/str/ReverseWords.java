package str;

/**
 * Created by zy on 2019/8/3.
 * To be a happy coder!
 * leeCode 557
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuilder rs = new StringBuilder();
        String[] array = s.split(" ");
        boolean flag = true;
        for (String str : array) {
            if (!flag) {
                rs.append(" ");
            } else {
                flag = false;
            }
            rs.append(reverse(str));

        }
        return rs.toString();
    }

    private static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
