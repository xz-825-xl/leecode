package array;

/**
 * 描述：990. 等式方程的可满足性
 *
 * @author zy
 * @date 2020/6/8 11:29
 */
public class EquationsPossible {
    public boolean equationsPossible(String[] equations) {
        int[] indexs = new int[26];
        for (int i = 0; i < 26; i++) {
            indexs[i] = i;
        }

        for (int i = 0; i < equations.length; i++) {
            if (equations[i].charAt(1) == '=') {
                int first = equations[i].charAt(0) - 'a';
                int last = equations[i].charAt(3) - 'a';
                unionIndex(indexs, first, last);
            }
        }

        for (int i = 0; i < equations.length; i++) {
            if (equations[i].charAt(1) == '!') {
                int first = equations[i].charAt(0) - 'a';
                int last = equations[i].charAt(3) - 'a';
                if (findIndex(indexs, first) == findIndex(indexs, last)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void unionIndex(int[] indexs, int first, int last) {
         indexs[findIndex(indexs, first)] = findIndex(indexs, last);
    }

    private int findIndex(int[] indexs, int first) {
        if (indexs[first] != first) {
            first = findIndex(indexs, indexs[first]);
            indexs[first] = first;
        }
        return first;
    }
}
