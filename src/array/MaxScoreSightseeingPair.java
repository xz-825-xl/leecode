package array;

/**
 * 描述：1014. 最佳观光组合
 *
 * @author zy
 * @date 2020/6/17 8:38
 */
public class MaxScoreSightseeingPair {

    // timeout
    public int maxScoreSightseeingPair(int[] A) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                maxValue = Math.max(maxValue, A[i] + A[j] + i - j);
            }
        }
        return maxValue;
    }

    public int maxScoreSightseeingPair2(int[] A) {
        int maxValue = Integer.MIN_VALUE;
        int mx = A[0] + 0;
        for (int i = 1; i < A.length; i++) {
            maxValue = Math.max(maxValue, mx + A[i] - i);
            mx = Math.max(mx, A[i] + i);
        }
        return maxValue;
    }
}
