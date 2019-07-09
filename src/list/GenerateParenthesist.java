package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zy on 2019/7/7.
 * To be a happy coder!
 * leeCode 22
 */
public class GenerateParenthesist {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list, "", '(', n - 1, n);
        return list;
    }

    public static void generate(List<String> list, String str, char c, int leftNum, int rightNum) {
        str = str + c;
        if (leftNum == 0 && rightNum == 0) {
            list.add(str);
        }
        if (leftNum > 0) {
            generate(list, str, '(', leftNum - 1, rightNum);
        }
        if (rightNum > leftNum) {
            generate(list, str, ')', leftNum, rightNum - 1);
        }
    }

}
