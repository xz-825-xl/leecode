package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述：1408. 数组中的字符串匹配
 *
 * @author zy
 * @date 2020/6/10 8:55
 */
public class StringMatching {

    public static List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> rs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                int lastIndex = j == 0 ? word.length() - 1 : word.length();
                for (int k = j + 1; k <= lastIndex; k++) {
                    set.add(word.substring(j, k));
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                rs.add(words[i]);
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        stringMatching(new String[]{"mass","as","hero","superhero"});
    }
}
