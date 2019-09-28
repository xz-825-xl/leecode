package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zy on 2019/9/28.
 * To be a happy coder!
 * 1002. 查找常用字符
 */
public class CommonChars {

    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] count = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            count[A[0].charAt(i) - 97]++;
        }

        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                temp[A[i].charAt(j) - 97]++;
            }
            for (int j = 0; j < count.length; j++) {
                count[j] = Math.min(count[j], temp[j]);
            }
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                list.add(String.valueOf((char) (i + 97)));
            }
        }
        return list;
    }

}
