package tree;

import entity.TreeNode;

/**
 * 描述：530. 二叉搜索树的最小绝对差
 *
 * @author zy
 * @date 2019/12/20 8:54
 */
public class GetMinimumDifference {
    int minDiff = Integer.MAX_VALUE;
    Integer pre = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return minDiff;
        }
        getMinimumDifference(root.right);
        if(pre != null){
            minDiff = Math.min(pre - root.val, minDiff);
        }
        pre = root.val;
        getMinimumDifference(root.left);
        return minDiff;
    }
}
