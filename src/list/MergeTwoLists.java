package list;

import entity.ListNode;

/**
 * @author Zhangying
 * @date 2019/8/7
 * leeCode 21
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        ListNode rs = null;
        ListNode pre = null;
        while (one != null && two != null) {
            ListNode listNode = new ListNode(Math.min(one.val, two.val));
            if (pre == null) {
                rs = listNode;
                pre = rs;
            } else {
                pre.next = listNode;
                pre = pre.next;
            }
            if (one.val <= two.val) {
                one = one.next;
            } else {
                two = two.next;
            }
        }

        while (one != null) {
            ListNode listNode = new ListNode(one.val);
            if (pre == null) {
                rs = listNode;
                pre = rs;
            } else {
                pre.next = listNode;
                pre = pre.next;
            }
            one = one.next;
        }

        while (two != null) {
            ListNode listNode = new ListNode(two.val);
            if (pre == null) {
                rs = listNode;
                pre = rs;
            } else {
                pre.next = listNode;
                pre = pre.next;
            }
            two = two.next;
        }
        return rs;
    }
}
