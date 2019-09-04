package bit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/9/4
 * 1018. 可被 5 整除的二进制前缀
 */
public class PrefixesDivBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = (sum << 1) % 5 + A[i];
            list.add(sum % 5 == 0);
        }
        return list;
    }
}
