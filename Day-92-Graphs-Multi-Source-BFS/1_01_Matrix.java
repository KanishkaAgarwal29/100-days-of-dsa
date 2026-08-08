class Pair {
    int row;
    int col;
    int dis;

    Pair(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}

class Solution {

    int m, n;

    int[] drow = {1, 0, -1, 0};
    int[] dcol = {0, 1, 0, -1};

    public int[][] updateMatrix(int[][] mat) {

        m = mat.length;
        n = mat[0].length;

        int[][] vis = new int[m][n];
        Queue<Pair> q = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 0) {
                    vis[i][j] = 0;
                    q.offer(new Pair(i, j, 0));
                } else {
                    vis[i][j] = -1;
                }
            }
        }

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            for (int i = 0; i < 4; i++) {

                int r = curr.row + drow[i];
                int c = curr.col + dcol[i];

                if (r >= 0 && r < m &&
                    c >= 0 && c < n &&
                    vis[r][c] == -1) {

                    vis[r][c] = curr.dis + 1;
                    q.offer(new Pair(r, c, curr.dis + 1));
                }
            }
        }

        return vis;
    }
}
