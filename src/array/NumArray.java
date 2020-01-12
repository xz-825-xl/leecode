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
        makeConnected(5, new int[][]{{0,1},{0,2},{3, 4},{2,3}});//0

    }

//    11
//            [[1,4],[0,3],[1,3],[3,7],[2,7],[0,1],[2,4],[3,6],[5,6],[6,7],[4,7],[0,7],[5,7]]   //3
    public static int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < connections.length; i++) {
            Set<Integer> set = map.getOrDefault(connections[i][0], new HashSet<>());
            set.add(connections[i][1]);
            map.putIfAbsent(connections[i][0], set);
        }
        int maxLength = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            Set<Integer> set = new HashSet<>();
            getSet(map, entry.getValue(), set);
            entry.getValue().addAll(set);
            maxLength = Math.max(maxLength, entry.getValue().size());
        }

        return n - 1 - maxLength;
    }

    private static void getSet(Map<Integer, Set<Integer>> map, Set<Integer> set, Set<Integer> restoreSet){
        if(set.isEmpty()){
            return;
        }
        for (Integer num: set) {
            Set<Integer> temp = map.getOrDefault(num, new HashSet<>());
            if(!temp.isEmpty()) {
                getSet(map, temp, restoreSet);
            }
            restoreSet.addAll(temp);
        }
    }
}
