package entity;

import java.util.List;

/**
 * @author Zhangying
 * @date 2019/8/15
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
