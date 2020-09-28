package tree;

import entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：117. 填充每个节点的下一个右侧节点指针 II
 *
 * @author Zhangying
 * @date 2020/9/28 15:48
 */
public class Connect {
    public Node connect(Node root) {
        dfs(root, 0, new ArrayList<>());
        return root;
    }

    private void dfs(Node root, int layer, List<List<Node>> node) {
        if (root == null) {
            return;
        }
        if (layer + 1 > node.size() || node.get(layer).isEmpty()) {
            node.add(layer, new ArrayList<>());
            node.get(layer).add(null);
        }
        int size = node.get(layer).size();
        Node lastNode = node.get(layer).get(size - 1);
        root.next = lastNode;
        node.get(layer).add(root);
        dfs(root.right, layer + 1, node);
        dfs(root.left, layer + 1, node);
    }
}
