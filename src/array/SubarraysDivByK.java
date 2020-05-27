package array;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：974. 和可被 K 整除的子数组
 *
 * @author zy
 * @date 2020/5/27 10:03
 */
public class SubarraysDivByK {
    public static int subarraysDivByK(int[] A, int K) {
        int sum = 0;
        int[] remainders = new int[K];
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum % K < 0) {
                remainders[K + sum % K]++;
            } else {
                remainders[sum % K]++;
            }
        }
        int count = remainders[0];
        for (int i = 0; i < remainders.length; i++) {
            count += (remainders[i] * (remainders[i] - 1)) / 2;
        }
        return count;
    }

    public static int subarraysDivByK2(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem : A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int modulus = (sum % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            ans += same;
            record.put(modulus, same + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
        //System.out.println(subarraysDivByK(new int[]{-2}, 6));
        //System.out.println(subarraysDivByK(new int[]{-1, 2, 9}, 2));
        System.out.println(subarraysDivByK(new int[]{8, 9, 7, 8, 9}, 8));
    }
}
