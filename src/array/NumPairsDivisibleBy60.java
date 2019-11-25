package array;

/**
 * 描述：1010. 总持续时间可被 60 整除的歌曲
 *
 * @author zy
 * @date 2019/11/25 8:52
 */
public class NumPairsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] array = new int[60];
        for (int i = 0; i < time.length; i++) {
            array[time[i] % 60]++;
        }

        for (int i = 1; i < 30; i++) {
            count += array[i] * array[60 - i];
        }
        count += (array[0] * (array[0] - 1) + array[30] * (array[30] - 1)) / 2;
        return count;
    }
}
