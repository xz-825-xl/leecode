package str;

/**
 * 描述：1189. “气球” 的最大数量 balloon
 *
 * @author zy
 * @date 2019/10/16 8:48
 */
public class MaxNumberOfBalloons {
    private String key = "balon";
    private int[] counts = new int[26];

    public int maxNumberOfBalloons(String text) {
        int count = Integer.MAX_VALUE;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 97]++;
        }
        chars = key.toCharArray();
        for (int i = 0; i < key.length(); i++) {
            if (chars[i] == 'l' || chars[i] == 'o') {
                count = Math.min(count, counts[chars[i] - 97] / 2);
            } else {
                count = Math.min(count, counts[chars[i] - 97]);
            }
        }
        return count;
    }

}
