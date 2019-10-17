package array;

/**
 * 描述：1217. 玩筹码
 *
 * @author zy
 * @date 2019/10/17 9:00
 */
public class MinCostToMoveChips {

    public int minCostToMoveChips(int[] chips) {
        int ood = 0;
        int even = 0;
        for (int i = 0; i < chips.length; i++) {
            if ((chips[i] & 1) == 1) {
                ood++;
            } else {
                even++;
            }
        }

        return Math.min(ood, even);
    }
}
