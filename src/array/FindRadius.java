package array;

import java.util.Arrays;

/**
 * 描述：475. 供暖器
 *
 * @author zy
 * @date 2019/11/11 10:46
 */
public class FindRadius {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int radius = -1;
        for (int i = 0; i < houses.length; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < heaters.length; j++) {
                temp = Math.min(temp, Math.abs(heaters[j] - houses[i]));
            }
            radius = Math.max(radius, temp);
        }
        return radius;
    }

    public int findRadius2(int[] houses, int[] heaters) {
        // 先进行升序排列
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        for (int house : houses) {
            while (i < heaters.length && heaters[i] < house) {
                // 一直找到处于房屋右侧的热水器
                i++;
            }
            if (i == 0) {
                radius = Math.max(radius, heaters[i] - house);
            } else if (i == heaters.length) {
                // 最后一个热水器
                return Math.max(radius, houses[houses.length - 1] - heaters[heaters.length - 1]);
            } else {
                // 房屋右侧的热水器和房屋左侧的热水器，取小的那个
                radius = Math.max(radius, Math.min(heaters[i] - house, house - heaters[i - 1]));
            }
        }
        return radius;
    }
}
