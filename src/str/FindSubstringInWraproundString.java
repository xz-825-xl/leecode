package str;

/**
 * 描述：467. 环绕字符串中唯一的子字符串
 *
 * @author zy
 * @date 2020/4/17 19:31
 */
public class FindSubstringInWraproundString {
    public static int findSubstringInWraproundString(String p) {
        char[] pChars = p.toCharArray();
        int[] counts = new int[26];
        for (int i = 0; i < pChars.length; i++) {
            counts[pChars[i] - 'a'] = 1;
        }
        for (int i = 0; i < pChars.length - 1; i++) {
            int temp = counts[pChars[i] - 'a'];
            counts[pChars[i] - 'a'] = 1;
            for (int j = i; j < pChars.length - 1; j++) {
                int p1 = pChars[j] - 'a';
                int p2 = pChars[j + 1] - 'a';
                if ((pChars[j] == 'z' && pChars[j + 1] == 'a') || (p1 + 1 == p2)) {
                    counts[pChars[i] - 'a']++;
                } else {
                    break;
                }
            }
            if (temp > counts[pChars[i] - 'a']) {
                counts[pChars[i] - 'a'] = temp;
            }
        }
        int count = 0;
        for (int i = 0; i < counts.length; i++) {
            count += counts[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString2("zab"));
        //System.out.println(findSubstringInWraproundString("abaab"));
    }

    public static int findSubstringInWraproundString2(String p) {
        char[] pChars = p.toCharArray();
        int[] counts = new int[26];
        int max = 1;
        for (int i = 0; i < pChars.length; i++) {
            if (i == 0) {
                counts[pChars[i] - 'a'] = max;
            } else if (pChars[i] - 'a' - (pChars[i - 1] - 'a') == 1
                    || pChars[i] - 'a' - (pChars[i - 1] - 'a') == -25) {
                max++;
            } else {
                max = 1;
            }
            counts[pChars[i] - 'a'] = Math.max(counts[pChars[i] - 'a'], max);
        }
        int count = 0;
        for (int i = 0; i < counts.length; i++) {
            count += counts[i];
        }
        return count;
    }
}
