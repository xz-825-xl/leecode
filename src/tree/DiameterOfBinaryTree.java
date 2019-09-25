package tree;

import entity.TreeNode;

/**
 * 描述：543. 二叉树的直径
 *
 * @author zy
 * @date 2019/9/24 15:55
 */
public class DiameterOfBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree2(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        max = Math.max(leftDepth + rightDepth, max);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
