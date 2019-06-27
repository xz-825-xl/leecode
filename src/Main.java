import array.TwoSum;
import entity.ListNode;
import entity.TreeNode;
import list.AddTwoNumbers;
import list.SwapPair;
import tree.IsSymmetric;

public class Main {

    public static void main(String[] args) {

        /*列表相关算法*/
//        ListNode l1 = ListNode.creatListNode();
//        ListNode l2 = ListNode.creatListNode();
//        AddTwoNumbers.addTwoNumbers(l1, l2);
//        SwapPair.swapPairs(l1);

        /*数组相关算法*/
//        int[] array = {1, 2, 3, 4, 5};
//        TwoSum.twoSum(array, 5);

        /*树相关*/
        TreeNode treeNode = TreeNode.createTreeNodes();
        treeNode.toString();
        IsSymmetric.isSymmetric(treeNode);

    }
}
