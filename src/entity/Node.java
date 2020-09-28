package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/8/15
 */
public class Node {

//    public int val;
//    public List<Node> children;
//
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//
//    public List<Node> neighbors;
//
//    public Node() {
//        val = 0;
//        neighbors = new ArrayList<Node>();
//    }
//
//    public Node(int _val) {
//        val = _val;
//        neighbors = new ArrayList<Node>();
//    }
//
//    public Node(int _val, ArrayList<Node> _neighbors) {
//        val = _val;
//        neighbors = _neighbors;
//    }

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
