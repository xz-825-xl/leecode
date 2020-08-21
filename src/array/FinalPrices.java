package array;

/**
 * 描述：1475. 商品折扣后的最终价格
 *
 * @author Zhangying
 * @date 2020/8/21 15:55
 */
public class FinalPrices {

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        System.out.println(finalPrices(new int[]{8, 4, 6, 2, 3}));
    }

}
