package str;

/**
 * 描述：392. 判断子序列
 *
 * @author zy
 * @date 2020/2/12 10:33
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int index = 0;
        for (int i = 0; i < t1.length; i++) {
            if (s1[index] == t1[i]) {
                index++;
            }
            if (index == s1.length) {
                return true;
            }
        }
        return false;
    }

}
