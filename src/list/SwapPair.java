package list;


import entity.ListNode;

/**
 * leeCode 24
 * @author Zhangying
 * @date 2019/6/24
 */
public class SwapPair {

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode resultNode = head.next;
        ListNode cur = head;
        cur.next = head.next.next;
        resultNode.next = cur;
        while (cur.next != null && cur.next.next != null){
            ListNode pre = cur;
            ListNode mid = cur.next;
            ListNode last = cur.next.next;
            mid.next = last.next;
            last.next = mid;
            pre.next = last;
            cur = pre.next.next;
        }
        return resultNode;
    }

}
