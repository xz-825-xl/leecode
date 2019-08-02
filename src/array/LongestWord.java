package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Zhangying
 * @date 2019/8/2
 */
public class LongestWord {

    public static String longestWord(String[] words) {
        Map<Integer, Set<String>> map = new HashMap<>(16);
        Set<String> strs = new HashSet<>();
        int max = 0;
        for (String word : words) {
            Set<String> set = map.getOrDefault(word.length(), new HashSet<>());
            set.add(word);
            map.put(word.length(), set);
            max = Math.max(word.length(), max);
            strs.add(word);
        }

        List<String> list = new ArrayList<>();
        for (int i = max; i > 0; i--) {
            Set<String> set = map.getOrDefault(i, new HashSet<>());
            for (String str : set) {
                boolean flag = true;
                for(int j = str.length() - 1; j > 0; j--){
                    if(!strs.contains(str.substring(0, j))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(str);
                }
            }
            if(!list.isEmpty()){
                break;
            }
        }
        Collections.sort(list);
        return list.isEmpty() ? "" : list.get(0);
    }

}
