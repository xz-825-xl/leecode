package list;

import entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zhangying
 * @date 2019/7/13
 * leeCode 160
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while (tmpA != null) {
            tmpA = tmpA.next;
            lengthA++;
        }
        while (tmpB != null) {
            tmpB = tmpB.next;
            lengthB++;
        }
        int dif = Math.abs(lengthA - lengthB);
        if (lengthA > lengthB) {
            while (dif > 0) {
                headA = headA.next;
                dif--;
            }
        } else {
            while (dif > 0) {
                headB = headB.next;
                dif--;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

}
