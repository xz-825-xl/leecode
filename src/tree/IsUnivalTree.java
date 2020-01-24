package tree;

import entity.TreeNode;

/**
 * 描述：965. 单值二叉树
 *
 * @author zy
 * @date 2020/1/24 13:27
 */
public class IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if((root.left != null && root.left.val != root.val)
                || (root.right != null && root.right.val != root.val)){
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
