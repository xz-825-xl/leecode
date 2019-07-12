package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/7/12
 * leeCode 110
 */
public class IsBalanced {

    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        getHigh(root);
        return flag;
    }

    public int getHigh(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHigh(root.left) + 1;
        int right = getHigh(root.right) + 1;
        if (Math.abs(left - right) > 1) {
            flag = false;
        }
        return Math.max(left, right);
    }

}
