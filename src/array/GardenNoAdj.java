package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Zhangying
 * @date 2019/9/4
 * 1042. 不邻接植花
 */
public class GardenNoAdj {
    public static int[] gardenNoAdj(int N, int[][] paths) {
        int[] res = new int[N];
        Map<Integer, Set<Integer>> map = new HashMap<>(N);
        for (int i = 1; i <= N; i++) {
            map.put(i, new HashSet<>());
        }
        for (int[] path : paths) {
            map.get(path[0]).add(path[1]);
            map.get(path[1]).add(path[0]);
        }
        for (int i = 1; i <= N; i++) {
            boolean[] tags = new boolean[4];
            for (Integer n : map.get(i)) {
                if(res[n - 1] > 0){
                    tags[res[n - 1] - 1] = true;
                }
            }
            for(int j = 0; j < 4; j++){
                if(!tags[j]){
                    res[i - 1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] gardenNoAdj2(int N, int[][] paths) {
        int[] res = new int[N];
        int[][] pointPath = new int[N][3];
        for (int[] path : paths) {
            int[] array = pointPath[path[0] - 1];
            for(int i = 0; i < array.length; i++){
                if(array[i] == 0){
                    array[i] = path[1];
                    break;
                }
            }
            pointPath[path[0] - 1] = array;
            array = pointPath[path[1] - 1];
            for(int i = 0; i < array.length; i++){
                if(array[i] == 0){
                    array[i] = path[0];
                    break;
                }
            }
            pointPath[path[1] - 1] = array;
        }
        for (int i = 1; i <= N; i++) {
            boolean[] tags = new boolean[4];
            for (int n : pointPath[i - 1]) {
                if(n > 0 && res[n - 1] > 0){
                    tags[res[n - 1] - 1] = true;
                }
            }
            for(int j = 0; j < 4; j++){
                if(!tags[j]){
                    res[i - 1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }
}
