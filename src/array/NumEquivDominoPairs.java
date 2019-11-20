package array;

/**
 * 描述：1128. 等价多米诺骨牌对的数量
 *
 * @author zy
 * @date 2019/11/20 11:04
 */
public class NumEquivDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int[] array = new int[100];
        for (int i = 0; i < dominoes.length; i++) {
            int temp = dominoes[i][1] > dominoes[i][0] ? dominoes[i][0] * 10 + dominoes[i][1] : dominoes[i][1] * 10 + dominoes[i][0];
            count += array[temp];
            array[temp]++;
        }
        return count;
    }
}
