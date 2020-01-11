package str;

/**
 * 描述：1309. 解码字母到整数映射
 *
 * @author zy
 * @date 2020/1/11 10:58
 */
public class FreqAlphabets {

    public static String freqAlphabets(String s) {
        char[] alphabetChars = new char[26];
        for (int i = 0; i < alphabetChars.length; i++) {
            alphabetChars[i] = (char) (97 + i);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((i < chars.length - 2 && chars[i + 2] != '#') || i >= chars.length - 2) {
                builder.append(alphabetChars[Integer.parseInt(String.valueOf(chars[i])) - 1]);
            } else {
                builder.append(alphabetChars[Integer.parseInt(String.valueOf(chars[i]) + chars[i + 1]) - 1]);
                i += 2;
            }
        }
        return builder.toString();
    }

    public static String freqAlphabets2(String s) {
        char[] alphabetChars = new char[27];
        for (int i = 1; i < alphabetChars.length; i++) {
            alphabetChars[i] = (char) (96 + i);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                builder.append(alphabetChars[(chars[i] - '0') * 10 + (chars[i + 1] - '0')]);
                i += 2;
            } else {
                builder.append(alphabetChars[chars[i] - '0']);
            }
        }
        return builder.toString();
    }

}
