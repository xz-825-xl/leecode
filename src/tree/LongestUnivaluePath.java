package tree;

import entity.TreeNode;

/**
 * 描述：687. 最长同值路径
 *
 * @author zy
 * @date 2019/12/28 17:15
 */
public class LongestUnivaluePath {
    private static int maxCount = 0;

    public static int longestUnivaluePath(TreeNode root) {
        sumPath(root);
        return maxCount;
    }

    public static int sumPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sumPath(root.left);
        int right = sumPath(root.right);
        left = (root.left != null && root.left.val == root.val) ? left + 1 : 0;
        right = (root.right != null && root.right.val == root.val) ? right + 1 : 0;
        maxCount = Math.max(maxCount, left + right);
        return Math.max(left, right);
    }
}
