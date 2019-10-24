package array;

/**
 * 描述：1103. 分糖果 II
 *
 * @author zy
 * @date 2019/10/24 8:37
 */
public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] rs = new int[num_people];
        int index = 1;
        while (candies > 0) {
            if (candies >= index) {
                rs[(index - 1) % num_people] += index;
            } else {
                rs[(index - 1) % num_people] += candies;
            }
            candies -= index;
            index++;
        }
        return rs;
    }
}
