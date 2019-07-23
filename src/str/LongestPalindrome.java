package str;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zhangying
 * @date 2019/7/23
 * leeCode 409
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        return count == s.length() ? count : count + 1;
    }

    public static int longestPalindrome2(String s) {
        int count = 0;
        int[] ints = new int[128];
        for (char c : s.toCharArray()) {
            ints[c]++;
        }
        for (int i : ints) {
            if (i >= 2) {
                count += (i / 2) * 2;
            }
        }
        return count == s.length() ? count : count + 1;
    }
}
