package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：491. 递增子序列
 *
 * @author Zhangying
 * @date 2020/8/25 9:03
 */
public class FindSubsequences {
    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return ans;
    }

    public void dfs(int cur, int last, int[] nums) {
        if (cur == nums.length) {
            if (temp.size() >= 2) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums);
        }
    }


    public static void main(String[] args) {
        FindSubsequences findSubsequences = new FindSubsequences();
        findSubsequences.findSubsequences(new int[]{4, 6, 7, 7});
    }
}
