package str;

/**
 * 描述：942. 增减字符串匹配
 *
 * @author zy
 * @date 2019/9/27 10:06
 */
public class DiStringMatch {

    public int[] diStringMatch(String S) {
        int[] rs = new int[S.length() + 1];
        int max = S.length();
        int min = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'D') {
                rs[i] = max--;
            } else {
                rs[i] = min++;
            }
        }
        rs[S.length()] = max;
        return rs;
    }

}
