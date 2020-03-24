package number;

/**
 * 描述：面试题64. 求1+2+…+n
 *
 * @author zy
 * @date 2020/3/24 9:46
 */
public class SumNums {
    public int sumNums(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        return sum;
    }

    public int sumNums2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNums2(n - 1);
    }
}
