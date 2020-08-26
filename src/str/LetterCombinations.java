package str;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：17. 电话号码的字母组合
 *
 * @author Zhangying
 * @date 2020/8/26 9:02
 */
public class LetterCombinations {
    static char[][] digArray = new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        char[] chars = digits.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char[] alphabets = digArray[chars[i] - '0' - 2];
            if (list.isEmpty()) {
                for (int j = 0; j < alphabets.length; j++) {
                    list.add(String.valueOf(alphabets[j]));
                }
            } else {
                List<String> tempList = new ArrayList<>();
                for (int k = 0; k < list.size(); k++) {
                    String str = list.get(k);
                    list.set(k, str + alphabets[0]);
                    for (int j = 1; j < alphabets.length; j++) {
                        tempList.add(str + alphabets[j]);
                    }
                }
                list.addAll(tempList);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
