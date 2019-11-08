package tree;

import entity.TreeNode;

/**
 * 描述：1022. 从根到叶的二进制数之和
 *
 * @author zy
 * @date 2019/11/8 8:53
 */
public class SumRootToLeaf {
    public static int sumRootToLeaf(TreeNode root) {
        return getSum(root, "");
    }

    public static int getSum(TreeNode root, String str) {
        if(root == null){
            return 0;
        }
        str += root.val;
        if (root.left == null && root.right == null) {
            return Integer.valueOf(str, 2);
        }
        return getSum(root.right, str) + getSum(root.left, str);
    }
}
