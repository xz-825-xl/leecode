package array;

/**
 * 描述：953. 验证外星语词典
 *
 * @author zy
 * @date 2019/12/4 8:49
 */
public class IsAlienSorted {
    public static boolean isAlienSorted(String[] words, String order) {
        int[] ints = new int[order.length()];
        for (int i = 0; i < order.length(); i++) {
            ints[order.charAt(i) - 'a'] = i;
        }
        for (int j = 0; j < words.length - 1; j++) {
            for (int i = 0; i < words[j].length(); i++) {
                if (words[j + 1].length() - 1 >= i) {
                    int i1 = words[j].charAt(i) - 'a';
                    int i2 = words[j + 1].charAt(i) - 'a';
                    if (ints[i1] > ints[i2]) {
                        return false;
                    } else if (ints[i1] < ints[i2]) {
                        break;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
