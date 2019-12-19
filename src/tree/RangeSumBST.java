package tree;

import entity.TreeNode;

/**
 * 描述：938. 二叉搜索树的范围和
 *
 * @author zy
 * @date 2019/12/19 8:44
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        sum += rangeSumBST(root.right, L, R);
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        sum += rangeSumBST(root.left, L, R);
        return sum;
    }

    public int rangeSumBST2(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val >= L && root.val <= R) {
            return root.val + rangeSumBST2(root.left, L, R) + rangeSumBST2(root.right, L, R);
        } else if (root.val < L) {
            return rangeSumBST2(root.right, L, R);
        } else {
            return rangeSumBST2(root.left, L, R);
        }
    }
}
