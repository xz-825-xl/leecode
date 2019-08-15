package tree;

import entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/8/15
 * leeCode 589
 */
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public void preorder(Node node, List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.val);
        List<Node> children = node.children;
        if(children != null && !children.isEmpty()){
            for(Node childNode : children){
                preorder(childNode, list);
            }
        }
    }

}
