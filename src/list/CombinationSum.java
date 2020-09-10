package list;

import java.util.*;

/**
 * 描述：39. 组合总和
 *
 * @author Zhangying
 * @date 2020/9/9 9:00
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return dfs(candidates, target, 0);
    }

    public List<List<Integer>> dfs(int[] candidates, int target, int pre) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            if (target >= candidates[i] && candidates[i] >= pre) {
                if (target > candidates[i] && target - candidates[i] >= candidates[i]) {
                    List<List<Integer>> temp = dfs(candidates, target - candidates[i], candidates[i]);
                    if (!temp.isEmpty()) {
                        int candidate = candidates[i];
                        temp.forEach(row -> row.add(candidate));
                        list.addAll(temp);
                    }
                } else if (target == candidates[i]) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(candidates[i]);
                    list.add(subList);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
