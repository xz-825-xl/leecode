package tree;

import entity.TreeNode;

/**
 * 描述：897. 递增顺序查找树
 *
 * @author zy
 * @date 2019/12/27 8:57
 */
public class IncreasingBST {
    private TreeNode node = null;//记录头结点
    private TreeNode temp = null;//记录各个节点

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return node;
        }
        increasingBST(root.left);
        if (node == null) {
            node = new TreeNode(root.val);//生成头结点
            temp = node;
        } else {
            temp.right = new TreeNode(root.val);//创建新节点
            temp = temp.right;//指向当前节点的右孩子
        }
        increasingBST(root.right);
        return node;
    }
}
