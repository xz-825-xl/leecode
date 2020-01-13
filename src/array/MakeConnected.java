package array;

/**
 * 描述：5309. 连通网络的操作次数
 *
 * @author zy
 * @date 2020/1/13 9:29
 */
public class MakeConnected {
    //用来记录第i个数的最终点是几
    private int[] father;

    public int makeConnected(int n, int[][] connections) {
        if (n - 1 < connections.length) {
            return -1;
        }
        int count = 0;
        father = new int[n];
        for (int i = 0; i < connections.length; i++) {
            father[connections[i][0]] = connections[i][1];
        }
        for (int i = 0; i < father.length; i++) {
            if (father[i] == i) {
                break;
            } else {
                int head = i;
                while (father[head] != head){
                    int temp = father[head];
                    father[i] = father[temp];
                    head = temp;
                }
            }
        }

        return count;
    }
}
