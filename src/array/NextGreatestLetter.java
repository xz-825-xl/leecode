package array;

/**
 * Created by Mmn on 2019/9/1.
 * To be a happy coder!
 * 744. 寻找比目标字母大的最小字母
 */
public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters.length == 0) {
            throw new RuntimeException("error!");
        }
        char c = letters[0];
        for (char ch : letters) {
            if (ch > target) {
                return ch;
            }
        }
        return c;
    }

    public static char nextGreatestLetter2(char[] letters, char target) {
        if (letters.length == 0) {
            throw new RuntimeException("error!");
        }
        if (letters[letters.length - 1] <= target || letters[0] > target) {
            return letters[0];
        }
        int l = 0;
        int r = letters.length - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (letters[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return letters[r];
    }

}
