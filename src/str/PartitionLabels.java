package str;

import java.util.*;

/**
 * 描述：763. 划分字母区间
 *
 * @author Zhangying
 * @date 2020/10/22 14:28
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int[] array = new int[26];
        Arrays.fill(array, -1);
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            array[chars[i] - 'a'] = (array[chars[i] - 'a'] == -1 ? 0 : array[chars[i] - 'a']) + i + 1;
        }

        int count = 0;
        Set<Character> set = new HashSet<>();
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            array[chars[i] - 'a'] -= +i + 1;
            set.add(chars[i]);
            length++;
            if(array[chars[i] - 'a'] == 0) {
                count++;
            }
            if (count != 0 && count == set.size()) {
                list.add(length);
                count = 0;
                set = new HashSet<>();
                length = 0;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij");
    }

}
