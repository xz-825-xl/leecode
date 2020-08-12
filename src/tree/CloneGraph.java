package tree;

import entity.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：133. 克隆图
 *
 * @author Zhangying
 * @date 2020/8/12 8:52
 */
public class CloneGraph {

    private static Map<Integer, Node> nodeMap = new HashMap<>();

    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (!nodeMap.containsKey(node.val)) {
            nodeMap.put(node.val, new Node(node.val));
        }
        Node node1 = nodeMap.get(node.val);
        for (Node node2 : node.neighbors) {
            Node subNode;
            if (nodeMap.containsKey(node2.val)) {
                subNode = nodeMap.get(node2.val);
            } else {
                subNode = cloneGraph(node2);
            }
            node1.neighbors.add(subNode);
        }
        return node1;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        cloneGraph(node1);
    }

}
