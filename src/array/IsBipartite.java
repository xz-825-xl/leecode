package array;

/**
 * 描述：785. 判断二分图
 *
 * @author zy
 * @date 2020/7/16 11:16
 */
public class IsBipartite {

    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        valid = true;
        color = new int[n];
        for (int i = 0; i < n && valid; ++i) {
            if (color[i] == UNCOLORED) {
                dfs(i, RED, graph);
            }
        }
        return valid;
    }

    public void dfs(int node, int c, int[][] graph) {
        color[node] = c;
        int cNei = c == RED ? GREEN : RED;
        for (int neighbor : graph[node]) {
            if (color[neighbor] == UNCOLORED) {
                dfs(neighbor, cNei, graph);
                if (!valid) {
                    return;
                }
            } else if (color[neighbor] != cNei) {
                valid = false;
                return;
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(isBipartite(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        //isBipartite(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}});
        //isBipartite(new int[][]{{1}, {0, 3}, {3}, {1, 2}});
        //System.out.println(isBipartite(new int[][]{{3}, {2, 4}, {1}, {0, 4}, {1, 3}}));
        //System.out.println(isBipartite(new int[][]{{3}, {2, 4}, {1}, {0, 4}, {1, 3}}));
    }
}
