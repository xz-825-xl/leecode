package tree;

import entity.TreeNode;

/**
 * 描述：543. 二叉树的直径
 *
 * @author zy
 * @date 2019/9/24 15:55
 */
public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        System.out.println(getMax(root.right));
        return getMax(root.right) + getMax(root.left);
    }

    public static int getMax(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftMax = getMax(node.left);
        int rightMax = getMax(node.right);
        System.out.println("root:" + node.val + " " + (Math.max(leftMax, rightMax) + 1));
//        System.out.println("root:" + node.val);
//        System.out.println("leftMax:" + leftMax);
//        System.out.println("rightMax:" + rightMax);
        return Math.max(leftMax, rightMax) + 1;
    }

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
        //max记录当前的最大直径
        max = Math.max(leftDepth + rightDepth, max);
        //由于我计算的直径是左树高度+右树高度，所以这里返回当前树的高度，以供使用
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
