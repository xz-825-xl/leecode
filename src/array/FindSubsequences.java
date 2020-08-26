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
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> increasingList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subList = new ArrayList<>();
            if (increasingList.isEmpty()) {
                subList.add(nums[i]);
            } else {
                boolean flag = false;
                for (List<Integer> sub : increasingList) {
                    if (nums[i] >= sub.get(sub.size() - 1)) {
                        sub.add(nums[i]);
                        flag = true;
                    }
                }
                if (flag) {
                    subList.add(nums[i]);
                }
            }
            increasingList.add(subList);
        }

        for (List<Integer> sub : increasingList) {
            getIncreasingList(list, sub);
        }
        return list;
    }

    private static void getIncreasingList(List<List<Integer>> list, List<Integer> sub) {
        if (sub.size() < 2) {
            return;
        }
        for (int i = 1; i < sub.size() - 1; i++) {
            for (int j = 1; j < sub.size() - i + 1; j++) {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(sub.get(0));
                for (int k = j; k < j + i; k++) {
                    sublist.add(sub.get(k));
                }
                if (!list.isEmpty()) {
                    List<Integer> lastList = list.get(list.size() - 1);
                    if (sublist.size() == lastList.size()) {
                        boolean flag = true;
                        for (int k = 0; k < sublist.size(); k++) {
                            if (sublist.get(k) != lastList.get(k)) {
                               flag = false;
                               break;
                            }
                        }
                        if(flag) {
                            continue;
                        }
                    }
                }

                list.add(sublist);
            }
        }
        list.add(sub);
    }

    public static void main(String[] args) {
        findSubsequences(new int[]{4, 6, 7, 7});
    }
}
