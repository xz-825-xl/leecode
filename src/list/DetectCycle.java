package list;

import entity.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 描述：142. 环形链表 II
 *
 * @author Zhangying
 * @date 2020/10/10 10:19
 */
public class DetectCycle {
    private Set<String> set = new HashSet<>();

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (set.contains(head.toString())) {
            return head;
        }
        set.add(head.toString());
        return detectCycle(head.next);
    }

    public static void main(String[] args) {
        new DetectCycle().detectCycle(new ListNode(1));
    }

}
