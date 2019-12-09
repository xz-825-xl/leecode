package tree;

import entity.TreeNode;

/**
 * 描述：671. 二叉树中第二小的节点
 *
 * @author zy
 * @date 2019/12/9 11:04
 */
public class FindSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return findSecond(root, root.val);
    }

    public int findSecond(TreeNode root, int min) {
        if (root == null) {
            return -1;
        }
        if (root.val == min) {
            int left = findSecond(root.left, min);
            int right = findSecond(root.right, min);
            if (left == -1 && right == -1) {
                return -1;
            }
            if (left == -1 && right != -1) {
                return right;
            }
            if (left != -1 && right == -1) {
                return left;
            }
            return Math.min(right, left);
        } else {
            return root.val;
        }
    }
}
