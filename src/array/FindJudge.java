package array;

/**
 * 描述：997. 找到小镇的法官
 *
 * @author zy
 * @date 2019/11/5 9:53
 */
public class FindJudge {
    public int findJudge(int N, int[][] trust) {
        int[] temp = new int[N + 1];
        temp[0] = -1;
        for (int i = 0; i < trust.length; i++) {
            temp[trust[i][0]] = -1;
            if(temp[trust[i][1]] != -1){
                temp[trust[i][1]]++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == N-1){
                return i;
            }
        }
        return N == 1 ? 1 : -1;
    }
}
