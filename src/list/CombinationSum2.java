package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：40. 组合总和 II
 *
 * @author Zhangying
 * @date 2020/9/10 9:43
 */
public class CombinationSum2 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>());
        return list;
    }

    public void dfs(int[] candidates, int target, int start, List<Integer> temp) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            //System.out.println("成功：" + temp);
        }  else {
            for (int i = start; i < candidates.length; i++) {

                if (target < candidates[start]) {
                    break;
                }
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                temp.add(candidates[i]);
                //System.out.println("加入" + candidates[i] + "," + temp);
                dfs(candidates, target - candidates[i], i + 1, temp);
                temp.remove(temp.size() - 1);
                //System.out.println("移除" + candidates[i] + "," + temp);
            }
        }
    }

    public static void main(String[] args) {
        new CombinationSum2().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
    }
}
