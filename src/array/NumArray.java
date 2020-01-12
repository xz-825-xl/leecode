package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by zy on 2020/1/12.
 * To be a happy coder!
 * 303. 区域和检索 - 数组不可变
 */
public class NumArray {

    private final int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

    public static int minFlips(int a, int b, int c) {
        int count = 0;
        while (c > 0 || a > 0 || b > 0) {
            int tempC = c & 1;
            int tempA = a & 1;
            int tempB = b & 1;
            if (tempC != (tempA | tempB)) {
                if (tempC == 0) {
                    count += (tempA == tempB ? 2 : 1);
                } else {
                    count += 1;
                }
            }
            c = c >> 1;
            a = a >> 1;
            b = b >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        //minFlips(8, 3, 5);
        //makeConnected(6, new int[][]{{0,1},{0,2},{0,3},{1,2},{1,3}});//2
        makeConnected(5, new int[][]{{0, 1}, {0, 2}, {3, 4}, {2, 3}});//0

    }

    //    11
//            [[1,4],[0,3],[1,3],[3,7],[2,7],[0,1],[2,4],[3,6],[5,6],[6,7],[4,7],[0,7],[5,7]]   //3
    static int[] father;

    static int find(int x) {
        if (father[x] == x) return x;
        return father[x] = find(father[x]);
    }

    public static int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        father = new int[n];
        for (int i = 0; i < n; i++) father[i] = i;
        for (int i = 0; i < connections.length; i++) {
            int a = connections[i][0];
            int b = connections[i][1];
            int fa = find(a);
            int fb = find(b);
            father[fa] = fb;
        }
        int res = -1;
        for (int i = 0; i < n; i++) if (father[i] == i) res++;
        return res;
    }

    private static void getSet(Map<Integer, Set<Integer>> map, Set<Integer> set, Set<Integer> restoreSet) {
        if (set.isEmpty()) {
            return;
        }
        for (Integer num : set) {
            Set<Integer> temp = map.getOrDefault(num, new HashSet<>());
            if (!temp.isEmpty()) {
                getSet(map, temp, restoreSet);
            }
            restoreSet.addAll(temp);
        }
    }
}
