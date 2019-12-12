package tree;

import entity.TreeNode;

/**
 * 描述：783. 二叉搜索树结点最小距离
 *
 * @author zy
 * @date 2019/12/12 9:06
 */
public class MinDiffInBST {
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return min;
        }
        minDiffInBST(root.right);
        if(pre != null) {
            min = Math.min(pre - root.val, min);
        }
        pre = root.val;
        minDiffInBST(root.left);
        return min;
    }
}
