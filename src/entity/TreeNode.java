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
        TreeNode treeNode2 = new TreeNode(-7);
        TreeNode treeNode3 = new TreeNode(-3);
        TreeNode treeNode4 = new TreeNode(-9);
        TreeNode treeNode5 = new TreeNode(-3);
        TreeNode treeNode11 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(-7);
        TreeNode treeNode7 = new TreeNode(-4);
        TreeNode treeNode8 = new TreeNode(6);
        TreeNode treeNode9 = new TreeNode(-6);
        TreeNode treeNode29 = new TreeNode(-6);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode16 = new TreeNode(6);
        TreeNode treeNode17 = new TreeNode(5);
        TreeNode treeNode18 = new TreeNode(9);
        TreeNode treeNode19 = new TreeNode(-1);
        TreeNode treeNode10 = new TreeNode(-4);
        TreeNode treeNode15 = new TreeNode(-2);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode3.left= treeNode4;
        treeNode3.right = treeNode5;
        treeNode4.left = treeNode11;
        treeNode4.right = treeNode6;
        treeNode5.left = treeNode7;
        treeNode11.left = treeNode8;
        treeNode6.left = treeNode9;
        treeNode6.right = treeNode29;
        treeNode8.left = treeNode0;
        treeNode8.right = treeNode16;
        treeNode9.left = treeNode17;
        treeNode29.left = treeNode18;
        treeNode0.right = treeNode19;
        treeNode16.left = treeNode10;
        treeNode18.left = treeNode15;
        return treeNode;
    }

}
