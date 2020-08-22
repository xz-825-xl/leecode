package array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：679. 24 点游戏(未完成)
 *
 * @author Zhangying
 * @date 2020/8/22 10:03
 */
public class JudgePoint24 {

    public static boolean judgePoint24(int[] nums) {
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new BigDecimal(String.valueOf(nums[i])));
        }
        return dfs(list);
    }

    private static boolean dfs(List<BigDecimal> list) {
        if (list.size() == 1) {
            return list.get(0).compareTo(new BigDecimal("24")) == 0;
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j != i) {
                    List<BigDecimal> subList = new ArrayList<>();
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            subList.add(list.get(i));
                        }
                    }

                    // 加法
                    subList.add(list.get(i).add(list.get(j)));
                    if (dfs(subList)) {
                        return true;
                    }
                    // 乘法
                    subList.set(subList.size() - 1, list.get(i).multiply(list.get(j)));
                    if (dfs(subList)) {
                        return true;
                    }
                    // 减法
                    subList.set(subList.size() - 1, list.get(i).subtract(list.get(j)));
                    if (dfs(subList)) {
                        return true;
                    }
                    // 除法
                    if (list.get(j).compareTo(BigDecimal.ZERO) != 0) {
                        subList.set(subList.size() - 1, list.get(i).divide(list.get(j)));
                        if (dfs(subList)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    static final int TARGET = 24;
    static final double EPSILON = 1e-6;
    static final int ADD = 0, MULTIPLY = 1, SUBTRACT = 2, DIVIDE = 3;

    public static boolean judgePoint242(int[] nums) {
        List<Double> list = new ArrayList<Double>();
        for (int num : nums) {
            list.add((double) num);
        }
        return solve(list);
    }

    public static boolean solve(List<Double> list) {
        if (list.size() == 0) {
            return false;
        }
        if (list.size() == 1) {
            return Math.abs(list.get(0) - TARGET) < EPSILON;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    List<Double> list2 = new ArrayList<Double>();
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            list2.add(list.get(k));
                        }
                    }
                    for (int k = 0; k < 4; k++) {
                        if (k < 2 && i > j) {
                            continue;
                        }
                        if (k == ADD) {
                            list2.add(list.get(i) + list.get(j));
                        } else if (k == MULTIPLY) {
                            list2.add(list.get(i) * list.get(j));
                        } else if (k == SUBTRACT) {
                            list2.add(list.get(i) - list.get(j));
                        } else if (k == DIVIDE) {
                            if (Math.abs(list.get(j)) < EPSILON) {
                                continue;
                            } else {
                                list2.add(list.get(i) / list.get(j));
                            }
                        }
                        if (solve(list2)) {
                            return true;
                        }
                        list2.remove(list2.size() - 1);
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //System.out.println(judgePoint242(new int[]{4, 1, 8, 7}));
        System.out.println(judgePoint24(new int[]{4, 1, 8, 7}));
    }
}
