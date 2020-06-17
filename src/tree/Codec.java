package tree;

import entity.TreeNode;

/**
 * 描述：297. 二叉树的序列化与反序列化
 *
 * @author zy
 * @date 2020/6/16 8:53
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfs(root, new StringBuilder()).toString();
    }

    private StringBuilder dfs(TreeNode root, StringBuilder builder) {
        if (root != null) {
            builder.append(root.val);
            builder.append(",");
            dfs(root.left, builder);
            dfs(root.right, builder);
        } else {
            builder.append(",");
        }
        return builder;
    }

    private int i = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(",");
        i = 0;
        return creatTreeNode(array);
    }

    private TreeNode creatTreeNode(String[] array) {
        if (i >= array.length || array[i].length() == 0) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(array[i]));
        ++i;
        node.left = creatTreeNode(array);
        ++i;
        node.right = creatTreeNode(array);
        return node;
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        String serialize = codec.serialize(TreeNode.createTreeNodes());
        TreeNode node = codec.deserialize(serialize);
        System.out.println(node.toString());
    }

}
