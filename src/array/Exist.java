package array;

/**
 * 描述：79. 单词搜索
 *
 * @author zy
 * @date 2020/6/1 16:15
 */
public class Exist {

    public static boolean exist(char[][] board, String word) {
        boolean[][] marked = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.startsWith(board[i][j] + "")) {
                    marked[i][j] = true;
                    if (findChar(board, word, 1, i, j, marked)) {
                        return true;
                    }
                    marked[i][j] = false;
                }
            }
        }
        return false;
    }

    public static boolean findChar(char[][] board, String word, int wordIndex, int i, int j, boolean[][] marked) {
        if (wordIndex == word.length()) {
            return true;
        }
        char c = word.charAt(wordIndex);
        boolean flag = false;
        //下面
        if (i < board.length - 1 && !marked[i + 1][j] && board[i + 1][j] == c) {
            marked[i + 1][j] = true;
            flag = wordIndex == word.length() - 1 || findChar(board, word, wordIndex + 1, i + 1, j, marked);
            marked[i + 1][j] = flag;
        }

        //上面
        if (!flag && i > 0 && !marked[i - 1][j] && board[i - 1][j] == c) {
            marked[i - 1][j] = true;
            flag = wordIndex == word.length() - 1 || findChar(board, word, wordIndex + 1, i - 1, j, marked);
            marked[i - 1][j] = flag;
        }

        //左面
        if (!flag && j > 0 && !marked[i][j - 1] && board[i][j - 1] == c) {
            marked[i][j - 1] = true;
            flag = wordIndex == word.length() - 1 || findChar(board, word, wordIndex + 1, i, j - 1, marked);
            marked[i][j - 1] = flag;
        }

        //右面
        if (!flag && j < board[0].length - 1 && !marked[i][j + 1] && board[i][j + 1] == c) {
            marked[i][j + 1] = true;
            flag = wordIndex == word.length() - 1 || findChar(board, word, wordIndex + 1, i, j + 1, marked);
            marked[i][j + 1] = flag;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
        //System.out.println(exist(new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}}, "aaaaaaaaaaaaa"));
//        System.out.println(exist(new char[][]{
//                        {'A', 'B', 'C', 'E'},
//                        {'S', 'F', 'E', 'S'},
//                        {'A', 'D', 'E', 'E'}},
//                "ABCESEEEFS"));
    }
}
