package entity;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhangying
 * @date 2019/6/27
 */
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(val);
        builder.append(",");

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        travers(queue, builder);
        return builder.toString();
    }

    private StringBuilder travers(Queue<TreeNode> queue, StringBuilder builder) {
        if (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            builder.append(node == null ? null : node.val);
            builder.append(",");
            if (node != null && (left != null || node.right != null)) {
                queue.offer(node.left == null ? null : node.left);
                queue.offer(node.right == null ? null : node.right);
            }
            travers(queue, builder);
        }
        return builder;
    }

    public static TreeNode createTreeNodes() {
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(1);
//        TreeNode treeNode6 = new TreeNode(4);
//        TreeNode treeNode7 = new TreeNode(7);
//        TreeNode treeNode8 = new TreeNode(2);
//        TreeNode treeNode9 = new TreeNode(1);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
//        treeNode2.left = treeNode4;
//        treeNode4.left = treeNode7;
//        treeNode4.right = treeNode8;
//        treeNode3.left = treeNode5;
//        treeNode3.right = treeNode6;
//        treeNode6.right = treeNode9;
        return treeNode;
    }

    public static TreeNode createTreeNodes2() {
        TreeNode treeNode = new TreeNode(-2);
        TreeNode treeNode2 = new TreeNode(-3);
        treeNode.right = treeNode2;
        return treeNode;
    }
}
