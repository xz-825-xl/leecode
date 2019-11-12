package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述：893. 特殊等价字符串组
 *
 * @author zy
 * @date 2019/11/12 8:46
 */
public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            StringBuilder builder = new StringBuilder();
            StringBuilder builder1 = new StringBuilder();
            char[] chars = A[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if ((j & 1) == 1) {
                   builder.append(chars[j]);
                } else {
                    builder1.append(chars[j]);
                }
            }
            char[] ch1 = builder.toString().toCharArray();
            char[] ch2 = builder1.toString().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            set.add(new String(ch1) + new String(ch2));
        }
        return set.size();
    }
}
