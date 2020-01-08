package tree;

import entity.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：653. 两数之和 IV - 输入 BST
 *
 * @author zy
 * @date 2020/1/8 8:51
 */
public class FindTarget {

    private static Set<Integer> set = new HashSet<>();

    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(root.val)) {
            return true;
        }
        set.add(k - root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
