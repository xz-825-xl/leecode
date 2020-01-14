package array;

/**
 * Created by zy on 2020/1/13.
 * To be a happy coder!
 * 1319. 连通网络的操作次数
 */
public class MakeConnected {
    private static int[] father;

    public static int makeConnected(int n, int[][] connections) {
        if (n - 1 > connections.length) {
            return -1;
        }
        int count = 0;
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
        for (int i = 0; i < connections.length; i++) {
            union(connections[i][0], connections[i][1]);
        }
        for (int i = 0; i < n; i++) {
            if (findFather(i) == i) {
                count++;
            }
        }
        return count - 1;
    }

    //递归找到 i 的头结点
    public static int findFather(int i) {
        if (father[i] == i) {
            return i;
        } else {
            father[i] = findFather(father[i]);
            return father[i];
        }
    }

    //将连个节点连在一起
    public static void union(int a, int b) {
        int i = findFather(a);
        int j = findFather(b);
        if (i != j) {
            father[i] = j;//选一个点作为共同的父节点
        }
    }
}


