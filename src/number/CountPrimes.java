package number;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zy on 2019/7/27.
 * To be a happy coder!
 * leeCode 204
 */
public class CountPrimes {

    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        boolean[] array = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!array[i]) {
                count++;
                for (int j = 1; j * i < n; j++) {
                    array[i * j] = true;
                }
            }
        }
        return count;
    }
}
