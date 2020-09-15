package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：216. 组合总和 III
 *
 * @author Zhangying
 * @date 2020/9/11 8:52
 */
public class CombinationSum3 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, new ArrayList<>(), 0);
        return list;
    }

    private void dfs(int k, int n, List<Integer> temp, int pre) {
        if (k < 1 || n > k * 9) {
            return;
        } else if (k == 1 && n < 10 && n > 0 && pre < n) {
            temp.add(n);
            list.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
        } else {
            for (int i = pre + 1; i < 10; i++) {
                temp.add(i);
                dfs(k - 1, n - i, temp, i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        new CombinationSum3().combinationSum3(3, 7);
    }
}
