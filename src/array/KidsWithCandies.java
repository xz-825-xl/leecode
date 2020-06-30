package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：1431. 拥有最多糖果的孩子
 *
 * @author zy
 * @date 2020/6/1 9:00
 */
public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> rs = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            maxNum = Math.max(maxNum, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            rs.add(candies[i] + extraCandies >= maxNum);
        }
        return rs;
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{12, 1, 12}, 10);
    }
}
