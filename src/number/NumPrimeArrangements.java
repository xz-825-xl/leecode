package number;

/**
 * 描述：1175. 质数排列
 *
 * @author zy
 * @date 2019/10/22 9:15
 */
public class NumPrimeArrangements {
    public static int numPrimeArrangements(int n) {
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(j != n && i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                primeCount++;
            }
        }
        long rs = 1;
        for (int i = 1; i <= primeCount; i++) {
            rs = (rs * i) % 1000000007;
        }

        for (int i = 1; i <= (n - primeCount); i++) {
            rs = (rs * i) % 1000000007;
        }

        return (int)rs % (int)(Math.pow(10, 9) + 7);
    }
}
