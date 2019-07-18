package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/7/18
 * leeCode 404
 */
public class SumOfLeftLeaves {

    /**
     * 计算给定二叉树的所有左叶子之和。
     *
     * @param root
     * @return
     */
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right)
                + (root.left == null || root.left.left != null || root.left.right != null ? 0 : root.left.val);
    }
}
