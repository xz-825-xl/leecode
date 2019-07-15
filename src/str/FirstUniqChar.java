package str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author Zhangying
 * @date 2019/7/15
 * leeCode 387
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(16);
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!queue.isEmpty() && i != queue.peek() && s.charAt(queue.peek()) == (c) && set.contains(c)) {
                i = queue.peek();
                queue.poll();
            } else if (!set.contains(c)) {
                queue.offer(i);
                set.add(c);
            }
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public static int firstUniqChar3(String s) {
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}
