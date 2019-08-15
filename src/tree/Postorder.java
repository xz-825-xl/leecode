package tree;

import entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangying
 * @date 2019/8/15
 * leeCode 590
 */
public class Postorder {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root != null){
            List<Node> nodes = root.children;
            if(nodes != null){
                for(Node node : nodes){
                    postorder(node);
                }
            }
            list.add(root.val);
        }
        return list;
    }
}
