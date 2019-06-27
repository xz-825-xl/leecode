package list;

import entity.ListNode;

/**
 * leeCode 2
 *
 * @author Zhangying
 * @date 2019/6/25
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        int num = 0;
        ListNode result = null, pre = null;
        while (l1 != null || l2 != null) {
            int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + num;
            num = (val >= 10) ? 1 : 0;
            val = (val >= 10) ? val - 10 : val;
            ListNode cur = new ListNode(val);
            if (pre == null) {
                result = cur;
            } else {
                pre.next = cur;
            }
            pre = cur;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        pre.next = num > 0 ? new ListNode(1) : null;
        return result;
    }

}
