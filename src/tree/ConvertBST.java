package tree;

import entity.TreeNode;

/**
 * 描述：538. 把二叉搜索树转换为累加树
 *
 * @author zy
 * @date 2019/12/10 8:52
 */
public class ConvertBST {
    int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += num;
        num = root.val;
        convertBST(root.left);
        return root;
    }
}
