package array;

import java.util.Arrays;

/**
 * Created by zy on 2019/8/11.
 * To be a happy coder!
 * leeCode 1046
 */
public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 0) {
            return 0;
        }
        for (int i = 0; i < stones.length - 1; i++) {
            Arrays.sort(stones);
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
        }

        return stones[stones.length - 1];
    }

}
