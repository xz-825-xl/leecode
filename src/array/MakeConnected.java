package array;

/**
 * Created by zy on 2020/1/13.
 * To be a happy coder!
 * 1319. 连通网络的操作次数
 */
public class MakeConnected {
    private static int[] father;

    public static int makeConnected(int n, int[][] connections) {
        if (n - 1 < connections.length) {
            return -1;
        }
        int count = 0;
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
        for (int i = 0; i < connections.length; i++) {
            father[connections[i][0]] = connections[i][1];
        }
        for (int i = 0; i < n; i++) {
            if (findFather(i) == i) {
                count++;
            }
        }
        return count - 1;
    }

    private static int findFather(int i) {
        if (father[i] == i) {
            return i;
        } else {
            return father[father[i]];
        }
    }
}
