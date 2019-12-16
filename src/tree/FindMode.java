package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：501. 二叉搜索树中的众数
 *
 * @author zy
 * @date 2019/12/16 10:47
 */
public class FindMode {
    static List<Integer> list = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    static Integer pre = null;
    static int count = 0;

    public static int[] findMode(TreeNode root) {
        travel(root);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    private static void travel(TreeNode root) {
        if (root != null) {
            travel(root.left);
            if (pre == null) {
                count ++;
                list.add(root.val);
                max = 1;
            } else {
                if (pre == root.val) {
                    count++;
                } else {
                    count = 1;
                }
                if (count > max) {
                    list.clear();
                    list.add(root.val);
                    max = count;
                } else if (count == max) {
                    list.add(root.val);
                }
            }
            pre = root.val;
            travel(root.right);
        }
    }
}
