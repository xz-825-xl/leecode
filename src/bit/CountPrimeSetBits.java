package bit;

/**
 * @author Zhangying
 * @date 2019/8/28
 * leeCode 762. 二进制表示中质数个计算置位
 */
public class CountPrimeSetBits {

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            count += isPrime(countOneNum(i));
        }
        return count;
    }

    private int countOneNum(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    private int isPrime(int num) {
        if (num < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
