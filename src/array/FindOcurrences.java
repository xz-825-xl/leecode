package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：1078. Bigram 分词
 *
 * @author zy
 * @date 2019/10/21 13:16
 */
public class FindOcurrences {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] array = text.split(" ");
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i].equals(first) && array[i + 1].equals(second)) {
                list.add(array[i + 2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
