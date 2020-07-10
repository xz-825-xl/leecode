package array;

/**
 * 描述：309. 最佳买卖股票时机含冷冻期
 *
 * @author zy
 * @date 2020/7/10 9:01
 */
public class MaxProfit309 {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        return Math.max(getProfit(prices, false, 0, 0), getProfit(prices, true, 1, prices[0]));
    }

    private static int getProfit(int[] prices, boolean hasBuy, int i, int price) {
        if (i >= prices.length) {
            return 0;
        }
        if (hasBuy) {
            if (price - prices[i] >= 0) {
                return getProfit(prices, true, i + 1, price);
            } else {
                return Math.max(getProfit(prices, true, i + 1, price), prices[i] - price + getProfit(prices, false, i + 2, prices[i]));
            }
        } else {
            return Math.max(getProfit(prices, true, i + 1, prices[i]), getProfit(prices, false, i + 1, 0));
        }
    }

    public static int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        /**
         * dp[i][0] 当前持有股票最大收益
         * dp[i][1]  当前冷冻期最大收益
         * dp[i][2]  当前不持有股票最大收益
         */
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0 - prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][2] - prices[i], dp[i - 1][0]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }
        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
