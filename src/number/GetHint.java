package number;

/**
 * 描述：299. 猜数字游戏
 *
 * @author zy
 * @date 2019/10/12 14:13
 */
public class GetHint {

    public static String getHint(String secret, String guess) {
        char[] chars1 = secret.toCharArray();
        char[] chars2 = guess.toCharArray();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < chars1.length ; i++) {
            if(chars1[i] == chars2[i]){
                count1++;
            }
        }
        for (int i = 0; i < chars1.length ; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if(chars1[i] == chars2[j]){
                    count2++;
                    char[] temp = new char[chars2.length - 1];
                    System.arraycopy(chars2, 0, temp, 0, j);
                    System.arraycopy(chars2, j + 1, temp, j, chars2.length - j - 1);
                    chars2 = temp;
                    break;
                }
            }
        }
        return String.format("%sA%sB", count1, count2 - count1);
    }

}
