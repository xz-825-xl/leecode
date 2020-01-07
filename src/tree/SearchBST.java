package tree;

import entity.TreeNode;

/**
 * 描述：700. 二叉搜索树中的搜索
 *
 * @author zy
 * @date 2020/1/6 8:45
 */
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
