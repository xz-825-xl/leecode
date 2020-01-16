package tree;

import entity.TreeNode;

/**
 * 描述：98. 验证二叉搜索树
 *
 * @author zy
 * @date 2020/1/16 11:19
 */
public class IsValidBST {
    Integer pre = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (pre != null && root.val <= pre) {
                return false;
            }
            pre = root.val;
            return isValidBST(root.right);
        }
        return false;
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (pre == null || root.val > pre) {
                pre = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
