package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangying
 * @date 2019/9/2
 * 1170. 比较字符串最小字母出现频次
 */
public class NumSmallerByFrequency {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] rs = new int[queries.length];
        Map<Integer, Integer> minAndCount = new HashMap<>(16);
        for (String word : words) {
            int count = getMinCount(word);
            minAndCount.put(count, minAndCount.getOrDefault(count, 0) + 1);
        }

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int minCount = getMinCount(query);
            int count = 0;
            for (Map.Entry<Integer, Integer> entry : minAndCount.entrySet()) {
                if (entry.getKey() > minCount) {
                    count += entry.getValue();
                }
            }
            rs[i] = count;
        }
        return rs;
    }

    private int getMinCount(String str) {
        int c = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < c) {
                c = str.charAt(i);
                count = 1;
            } else if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
