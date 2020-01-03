package number;

/**
 * 描述：1281. 整数的各位积和之差
 *
 * @author zy
 * @date 2020/1/3 9:04
 */
public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
       int multiSum = 1;
       int sum = 0;
       int temp;
       while (n > 0){
           temp = n % 10;
           n /= 10;
           multiSum *= temp;
           sum += temp;
       }
       return multiSum - sum;
    }
}
