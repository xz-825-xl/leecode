import array.TwoSum;
import entity.ListNode;
import list.AddTwoNumbers;
import list.SwapPair;

public class Main {

    public static void main(String[] args) {

        /*列表相关算法*/
        ListNode l1 = ListNode.creatListNode();
        ListNode l2 = ListNode.creatListNode();
        AddTwoNumbers.addTwoNumbers(l1, l2);
        SwapPair.swapPairs(l1);

        /*数组相关算法*/
        int[] array = {1, 2, 3, 4, 5};
        TwoSum.twoSum(array, 5);

    }
}
