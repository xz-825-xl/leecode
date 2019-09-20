package array;

/**
 * 描述：985. 查询后的偶数和
 *
 * @author zy
 * @date 2019/9/20 8:39
 */
public class SumEvenAfterQueries {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] rs = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += (A[i] % 2 == 0 ? A[i] : 0);
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] % 2 == 0 && A[queries[i][1]] % 2 == 0) {
                sum += queries[i][0];
            } else if (queries[i][0] % 2 != 0 && A[queries[i][1]] % 2 != 0) {
                sum += queries[i][0] + A[queries[i][1]];
            } else if (queries[i][0] % 2 != 0 && A[queries[i][1]] % 2 == 0) {
                sum -= A[queries[i][1]];
            }
            A[queries[i][1]] += queries[i][0];
            rs[i] = sum;
        }
        return rs;
    }
}
