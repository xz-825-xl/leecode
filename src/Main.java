import array.*;
import bit.BinaryGap;
import bit.BitwiseComplement;
import bit.FindComplement;
import bit.HasAlternatingBits;
import entity.ListNode;
import entity.TreeNode;
import list.MergeTwoLists;
import list.MyLinkedList;
import number.CheckPerfectNumber;
import number.ConvertToTitle;
import number.DayOfYear;
import number.GetHint;
import number.ReachNumber;
import number.RotatedDigits;
import str.CountBinarySubstrings;
import str.NumberOfLines;
import str.RemoveDuplicates;
import str.RemoveOuterParentheses;
import tree.DiameterOfBinaryTree;
import tree.SortedArrayToBST;

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
//        System.out.println(IsSymmetric.isSymmetric(treeNode));

//        Long start = (new Date()).getTime();
//        System.out.println(ClimStairs.climbStairs(44));
//        Long end = (new Date()).getTime();
//        System.out.println(end - start);
//        start = (new Date()).getTime();
//        System.out.println(ClimStairs.climbStairs2(44));
//        end = (new Date()).getTime();
//        System.out.println(end - start);

//        System.out.println(FindLength.findLengthOfLCIS(new int[]{1,2,5,8,0}));
//        CountAndSay.countAndSay(4);
//        GenerateParenthesist.generateParenthesis(3);
//        Merge.merge2(new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3}, 3);
//        CountSegments.countSegments("Of all the gin joints in all the towns in all the world,   ");
//        FirstUniqChar.firstUniqChar2("loveleetcode");
//        System.out.println(SumOfLeftLeaves.sumOfLeftLeaves(TreeNode.createTreeNodes()));
//        System.out.println(ReadBinaryWatch.readBinaryWatch(1));
        //ToHex.toHex(-1);
//        LongestPalindrome.longestPalindrome2("abccccdd");
//        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
//        NumberOfBoomerangs.numberOfBoomerangs(points);
//        GetRow.getRow2(3);
//        int[] ints = {0,0,1,0,0};
//        CanPlaceFlowers.canPlaceFlowers(ints, 1);
//        ValidPalindrome.validPalindrome("abc");
//        String[] strings = {"a","banana","app","appl","ap","apply","apple"};
//        LongestWord.longestWord(strings);

//        MyLinkedList obj = new MyLinkedList();
//        obj.addAtIndex(-1, 0);
//        obj.deleteAtIndex(0);
//        obj.addAtIndex(3, 0);
//        obj.addAtTail(1);
//        obj.addAtTail(0);
//        obj.deleteAtIndex(6);
//        MergeTwoLists.mergeTwoLists(ListNode.creatListNode(), ListNode.creatListNode2());
        int[] ints1 = {-1, 0};
        int[] ints2 = {0, 4, 0, 3, 2};
//        int[] ints2 = {5,6,7,8};
//        FindContentChildren.findContentChildren(ints1, ints2);
//        LastStoneWeight.lastStoneWeight(ints1);
//        KthLargest largest = new KthLargest(1, ints1);
//        largest.add(-3);
//        largest.add(-2);
//        largest.add(-4);
//        largest.add(0);
//        largest.add(4);
//        NextGreaterElement.nextGreaterElement(ints1, ints2);
//        FindComplement.findComplement(5);
//        TwoSum2.twoSum(ints1, -1);
//        CheckPerfectNumber.checkPerfectNumber(28);
//        CountBinarySubstrings.countBinarySubstrings("10101");
        //       HasAlternatingBits.hasAlternatingBits(5);
        //       ReachNumber.reachNumber(-2);
        //       SortedArrayToBST.sortedArrayToBST(ints2);
        //       FindMaxAverage.findMaxAverage(ints2, 1);
//        char[] chars = {'c','f','j'};
//        NextGreatestLetter.nextGreatestLetter2(chars, 'j');
//        ConvertToTitle.convertToTitle(26);
        int[] ins1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] ins2 = {2, 3};
        int[] ins3 = {3, 1};
        int[][] array = {ins1, ins2, ins3};
//        GardenNoAdj.gardenNoAdj2(3, array);
//        BinaryGap.binaryGap(22);
//        NumberOfLines.numberOfLines(ins1, "abcdefghijklmnopqrstuvwxyz");
//        DietPlanPerformance.dietPlanPerformance(new int[]{1, 2, 3, 4, 5}, 1, 3, 3);
//        MaxCount.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}});
//        NumberOfLines.numberOfLines(ins1, "abcdefghijklmnopqrstuvwxyz");
//        HasGroupsSizeX.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2});
//        RemoveDuplicates.removeDuplicates("aaaaaaaa");
//        RemoveOuterParentheses.removeOuterParentheses("(()())(())");
//        RotatedDigits.rotatedDigits(10);
//        OrangesRotting.orangesRotting(new int[][]{{2},{1},{1},{1},{2},{1},{1}});
//        OrangesRotting.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
//        SortedSquares.sortedSquares(new int[]{-4,-1,0,3,10});
//        AddToArrayForm.addToArrayForm(new int[]{1,2,0,0}, 34);
//        OrangesRotting.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
//        SumEvenAfterQueries.sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
//   RelativeSortArray.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
        TreeNode treeNode = TreeNode.createTreeNodes();
//        DiameterOfBinaryTree.diameterOfBinaryTree(treeNode);
//        BitwiseComplement.bitwiseComplement(0);
//        CommonChars.commonChars(new String[]{"bella", "label", "roller"});
//        CalPoints.calPoints(new String[]{"5","2","C","D","+"});
//        FindUnsortedSubarray.findUnsortedSubarray2(new int[]{2,6,4,8,10,9,15});
//        NumUniqueEmails.numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"});
//        InvalidTransactions.invalidTransactions(new String[]{"alex,676,260,bangkok","bob,656,1366,bangkok","alex,393,616,bangkok","bob,820,990,amsterdam","alex,596,1390,amsterdam"});
//        GetHint.getHint("1807","7810");
//        HeightChecker.heightChecker(new int[]{1,2,2,2,2,2,1,2,2,1});
 //       DistanceBetweenBusStops.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 3);
 //       DayOfYear.dayOfYear("2004-03-01");
        CountCharacters.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
    }
}
