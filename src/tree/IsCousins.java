package tree;

import entity.TreeNode;

/**
 * 描述：993. 二叉树的堂兄弟节点
 *
 * @author zy
 * @date 2019/12/14 10:44
 */
public class IsCousins {
    private static int xDepth;
    private static int xPar;
    private static int yDepth;
    private static int yPar;

    public static boolean isCousins(TreeNode root, int x, int y) {
        deepTree(root.right, x, y, 1, root.val);
        deepTree(root.left, x, y, 1, root.val);
        return (xDepth == yDepth) && (xPar != yPar);
    }

    private static void deepTree(TreeNode root, int x, int y, int depth, int par) {
        if (root == null) {
            return;
        }
        if (root.val == x) {
            xDepth = depth;
            xPar = par;
        } else if (root.val == y) {
            yDepth = depth;
            yPar = par;
        } else {
            deepTree(root.right, x, y, depth + 1, root.val);
            deepTree(root.left, x, y, depth + 1, root.val);
        }
    }
}
