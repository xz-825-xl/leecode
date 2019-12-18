package list;

import entity.ListNode;

/**
 * 描述：1290. 二进制链表转整数
 *
 * @author zy
 * @date 2019/12/18 8:47
 */
public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null){
            sum <<= 1;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }
}
