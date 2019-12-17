package tree;

import entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 描述：637. 二叉树的层平均值
 *
 * @author zy
 * @date 2019/12/17 8:51
 */
public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        List<List<Integer>> nodes = new ArrayList<>();
        travel(root, nodes, 0);
        for (int i = 0; i < nodes.size(); i++) {
            double average = nodes.get(i).stream().collect(Collectors.averagingDouble(row -> row));
            list.add(average);
        }
        return list;
    }

    private void travel(TreeNode node, List<List<Integer>> list, int num) {
        if (node == null) {
            return;
        }
        if (list.size() - 1 < num) {
            list.add(new ArrayList<>());
        }
        list.get(num).add(node.val);
        travel(node.left, list, num + 1);
        travel(node.right, list, num + 1);
    }

    public List<Double> averageOfLevels2(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            int n = treeNodes.size();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode treeNode = treeNodes.poll();
                sum += treeNode.val;
                if (treeNode.left != null) {
                    treeNodes.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNodes.add(treeNode.right);
                }
            }
            list.add(sum/n);
        }
        return list;
    }
}
