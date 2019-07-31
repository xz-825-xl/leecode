package array;

/**
 * @author Zhangying
 * @date 2019/7/31
 * leeCode 605
 */
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                return true;
            }
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed.length == 1 || flowerbed[1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (i == flowerbed.length - 1 && flowerbed.length - 2 >= 0 && flowerbed[flowerbed.length - 2] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
