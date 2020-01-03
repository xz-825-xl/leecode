package tree;

import entity.TreeNode;

/**
 * 描述：112. 路径总和
 *
 * @author zy
 * @date 2020/1/3 9:24
 */
public class HasPathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.right != null || root.left != null) {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
        return sum == root.val;
    }
}
