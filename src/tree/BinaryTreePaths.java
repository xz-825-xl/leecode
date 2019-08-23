package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/8/23
 * leeCode 257. 二叉树的所有路径
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        getPath(root, list, builder);
        return list;
    }

    private void getPath(TreeNode node, List<String> list, StringBuilder builder) {
        if (node == null) {
            return;
        }
        builder.append(node.val);
        if (node.left == null && node.right == null) {
            list.add(builder.toString());
        }
        builder.append("->");
        StringBuilder temp = new StringBuilder(builder.toString());
        getPath(node.left, list, builder);
        getPath(node.right, list, temp);
    }
}
