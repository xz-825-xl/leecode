package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：47. 全排列 II
 *
 * @author Zhangying
 * @date 2020/9/18 9:33
 */
public class PermuteUnique {

    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        dfs(Arrays.stream(nums).boxed().collect(Collectors.toList()), new LinkedList<>());
        return list;
    }

    private void dfs(List<Integer> nums, LinkedList<Integer> temp) {
        if (nums.size() == 0) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.size(); i++) {
                if (i > 0 && nums.get(i) == nums.get(i - 1)) {
                    continue;
                }
                int num = nums.get(i);
                temp.addLast(num);
                nums.remove(i);
                dfs(new ArrayList<>(nums), temp);
                nums.add(i, num);
                temp.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        new PermuteUnique().permuteUnique(new int[]{1, 1, 2});
    }
}
