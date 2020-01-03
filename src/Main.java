import entity.TreeNode;
import number.FindNumbers;
import number.SubtractProductAndSum;
import tree.HasPathSum;
import tree.IsSubtree;
import tree.LongestUnivaluePath;

import java.util.Collections;

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
//        int[] ints1 = {-1, 0};
//        int[] ints2 = {0, 4, 0, 3, 2};
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
//        int[] ins1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        int[] ins2 = {2, 3};
//        int[] ins3 = {3, 1};
//        int[][] array = {ins1, ins2, ins3};
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
//        TreeNode treeNode = TreeNode.createTreeNodes();
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
        //       CountCharacters.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
        //         DuplicateZeros.duplicateZeros3(new int[]{8,4,5,0,0,0,0,7});
        //       System.out.println(NumPrimeArrangements.numPrimeArrangements(100));
        //       MinimumAbsDifference.minimumAbsDifference(new int[]{4,2,1,3});
        //       MiddleNode.middleNode(ListNode.creatListNode());
        //       IsMonotonic.isMonotonic(new int[]{1, 2, 2, 3});
        //       IsLongPressedName.isLongPressedName("saeed", "ssaaedd");
        //       LargestPerimeter.largestPerimeter(new int[]{3,2,3,4});
        // FloodFill.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1,1 , 2);
        //FairCandySwap.fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        //TwoCitySchedCost.twoCitySchedCost(new int[][]{{518,518},{71,971},{121,862},{967,607},{138,754},{513,337},{499,873},{337,387},{647,917},{76,417}});
        //       SumRootToLeaf.sumRootToLeaf(TreeNode.createTreeNodes());
//        FindRadius.findRadius(new int[]{1,2 ,3}, new int[]{2});
//        GcdOfStrings.gcdOfStrings("ABABABAB", "ABAB");
        //       SurfaceArea.surfaceArea(new int[][]{{1, 0},{0, 2}});
        //       OddCells.oddCells(2, 3, new int[][]{{0, 1},{1, 1}});
        //       ShiftGrid.shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 9);
//        Tribonacci.tribonacci(34);
//        LargestSumAfterKNegations.largestSumAfterKNegations(new int[]{-8,3,-5,-3,-5,-2}, 6);
//        LargestSumAfterKNegations.largestSumAfterKNegations(new int[]{4,4,-9,2,1,7,5,8}, 3);
//        PeakIndexInMountainArray.peakIndexInMountainArray(new int[]{18,29,38,59,98,100,99,98,90});
//        ImageSmoother.imageSmoother(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
//        ImageSmoother.imageSmoother(new int[][]{{1}});
        //       Tictactoe.tictactoe(new int[][]{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}});
        //       IsAlienSorted.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz");
        //       IsAlienSorted.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz");
        //       IsAlienSorted.isAlienSorted(new String[]{"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"}, "zkgwaverfimqxbnctdplsjyohu");
        //       Tree2str.tree2str(TreeNode.createTreeNodes());
        //       IsCousins.isCousins(TreeNode.createTreeNodes(), 2, 3);
//        FindMode.findMode(TreeNode.createTreeNodes());
//        String myStr = new StringBuilder("aabbccdd").toString();
//        String h ="aabbccdd";
//        String s = "aabb" + "ccdd";
//        String s1 = new String("aabbccdd");
//        String s2 = new String("aabbccdd");
//        String s3 = new StringBuilder("aabb").append("ccdd").toString();
//        System.out.println(s == h);// true
//        System.out.println(myStr ==h);//false
//        System.out.println(myStr == s3);//false
//        System.out.println(s1 == s2);//false
//        System.out.println(s1 == s3);//false
//        int a = 128;
//        Integer b = Integer.valueOf(127);
//        Integer c = Integer.valueOf(127);
//       // Integer b = new Integer(1);
//        System.out.println(b == c);

//        IsSubtree.isSubtree(TreeNode.createTreeNodes(), TreeNode.createTreeNodes2());
//        FindNumbers.findNumbers(new int[]{12,345,2,6,7896});
//        LongestUnivaluePath.longestUnivaluePath(TreeNode.createTreeNodes());
//        SubtractProductAndSum.subtractProductAndSum(234);
        HasPathSum.hasPathSum(TreeNode.createTreeNodes2(), -5);
    }
}
