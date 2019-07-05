package array;

/**
 * @author Zhangying
 * @date 2019/7/5
 * leeCode 121
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int result = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i - 1]);
            result = Math.max(prices[i] - min, result);
        }
        return result;
    }
}
