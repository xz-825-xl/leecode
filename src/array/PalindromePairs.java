package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：336. 回文对
 *
 * @author Zhangying
 * @date 2020/8/6 9:09
 */
public class PalindromePairs {
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindrome(words[i] + words[j])) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(i);
                    subList.add(j);
                    list.add(subList);
                }
                if (isPalindrome(words[j] + words[i])) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(j);
                    subList.add(i);
                    list.add(subList);
                }
            }
        }
        return list;
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> palindromePairs2(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
    }

}
