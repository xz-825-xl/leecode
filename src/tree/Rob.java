package tree;

import entity.TreeNode;

/**
 * 描述：337. 打家劫舍 III
 *
 * @author Zhangying
 * @date 2020/8/5 10:54
 */
public class Rob {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(rob(root.left, false) + rob(root.right, false),
                root.val + rob(root.left, true) + rob(root.right, true));
    }

    public int rob(TreeNode root, boolean parentFlag) {
        if (root == null) {
            return 0;
        }
        if (parentFlag) {
           return rob(root.left, false) + rob(root.right, false);
        } else {
            return Math.max(rob(root.left, false) + rob(root.right, false),
                    root.val + rob(root.left, true) + rob(root.right, true));
        }
    }
}
