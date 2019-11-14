package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：961. 重复 N 次的元素
 *
 * @author zy
 * @date 2019/11/14 9:27
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        int rs = -1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return rs;
    }

}
