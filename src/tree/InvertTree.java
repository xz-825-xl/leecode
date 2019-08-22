package tree;

import entity.TreeNode;

/**
 * @author Zhangying
 * @date 2019/8/22
 * leeCode 226 翻转二叉树
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
       invertTreeSub(root);
       return root;
    }

    public void invertTreeSub(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        invertTreeSub(root.right);
        invertTreeSub(root.left);
    }
}
