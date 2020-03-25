package number;

/**
 * 描述：面试题46. 把数字翻译成字符串
 *
 * @author zy
 * @date 2020/3/24 15:28
 */
public class TranslateNum {

    public static int translateNum(int num) {
        if(num < 10) {
            return 1;
        }
        if(num < 26) {
            return 2;
        }
        int temp = num % 100;
        if(temp > 9 && temp < 26) {
            return translateNum(num / 100) + translateNum(num / 10);
        }
        return translateNum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(translateNum(1727101694));
    }
}
