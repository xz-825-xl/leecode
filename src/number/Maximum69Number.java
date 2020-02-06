package number;

/**
 * 描述：1323. 6 和 9 组成的最大数字
 *
 * @author zy
 * @date 2020/2/6 18:46
 */
public class Maximum69Number {
    public static int maximum69Number (int num) {
        int index = 0;
        int temp = num;
        int tempIndex = 0;
        while (temp > 0){
            tempIndex++;
            if(temp % 10 == 6){
                index = tempIndex;
            }
            temp /= 10;
        }
        return num + (int) (3 * Math.pow(10, index - 1));
    }
}
