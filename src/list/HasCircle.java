package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/7/5
 * leeCode 141
 */
public class HasCircle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
