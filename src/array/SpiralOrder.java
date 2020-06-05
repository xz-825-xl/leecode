package array;

/**
 * 描述：面试题29. 顺时针打印矩阵
 *
 * @author zy
 * @date 2020/6/5 10:06
 */
public class SpiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }
        int[] printResult = new int[matrix.length * matrix[0].length];
        int iStart = 0;
        int iEnd = matrix.length - 1;
        int jStart = 0;
        int jEnd = matrix[0].length - 1;

        int index = 0;
        while ((matrix.length - 1 >= iStart && 0 <= iEnd) || (matrix[0].length - 1 >= jStart && 0 <= jEnd)) {
            if(index < printResult.length) {
                for (int i = jStart; i <= jEnd; i++) {
                    printResult[index] = matrix[iStart][i];
                    index++;
                }
            }
            iStart++;

            if(index < printResult.length) {
                for (int i = iStart; i <= iEnd; i++) {
                    printResult[index] = matrix[i][jEnd];
                    index++;
                }
            }
            jEnd--;

            if(index < printResult.length) {
                for (int i = jEnd; i >= jStart; i--) {
                    printResult[index] = matrix[iEnd][i];
                    index++;
                }
            }
            iEnd--;

            if(index < printResult.length) {
                for (int i = iEnd; i >= iStart; i--) {
                    printResult[index] = matrix[i][jStart];
                    index++;
                }
            }
            jStart++;

        }
        return printResult;
    }

    public static void main(String[] args) {
        //spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}}));
    }
}
