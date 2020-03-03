package array;

/**
 * 描述：1310. 子数组异或查询
 *
 * @author zy
 * @date 2020/3/3 15:02
 */
public class XorQueries {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] rs = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = arr[queries[i][0]];
            for (int j = queries[i][0] + 1; j <= queries[i][1]; j++) {
                sum ^= arr[j];
            }
            rs[i] = sum;
        }
        return rs;
    }

    public int[] xorQueries2(int[] arr, int[][] queries) {
        int[] rs = new int[queries.length];
        int[] xor = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                xor[i] = arr[i];
            } else {
                xor[i] = arr[i] ^ xor[i - 1];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                rs[i] = xor[queries[i][1]];
            } else {
                rs[i] = xor[queries[i][1]] ^ xor[queries[i][0] - 1];
            }
        }
        return rs;
    }

    public int[] xorQueries3(int[] arr, int[][] queries) {
        int[] rs = new int[queries.length];
        int[] xor = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            xor[i + 1] = arr[i] ^ xor[i];
        }
        for (int i = 0; i < queries.length; i++) {
            rs[i] = xor[queries[i][1] + 1] ^ xor[queries[i][0]];
        }
        return rs;
    }
}
