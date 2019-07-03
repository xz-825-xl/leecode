import array.Search;
import array.TwoSum;
import entity.ListNode;
import entity.TreeNode;
import list.AddTwoNumbers;
import list.SwapPair;
import number.Reverse;
import recursion.ClimStairs;
import tree.IsSymmetric;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

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
//        TreeNode treeNode = TreeNode.createTreeNodes();
//        treeNode.toString();
//        IsSymmetric.isSymmetric(treeNode);

        Long start = (new Date()).getTime();
        System.out.println(ClimStairs.climbStairs(44));
        Long end = (new Date()).getTime();
        System.out.println(end - start);
        start = (new Date()).getTime();
        System.out.println(ClimStairs.climbStairs2(44));
        end = (new Date()).getTime();
        System.out.println(end - start);
    }
}
