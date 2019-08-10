package array;

import java.util.Arrays;

/**
 * @author Zhangying
 * @date 2019/8/9
 * leeCode 455
 */
public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        for (int i : g) {
            while (true) {
                if (index > s.length - 1) {
                    break;
                }
                if (i <= s[index]) {
                    count++;
                    index++;
                    break;
                }
                index++;
            }
        }
        return count;
    }

}
