class Pair {
    int row;
    int col;
    int tm;

    Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int countFresh = 0;
        int rottenCount = 0;
        Queue<Pair> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = 2;
                    q.offer(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1)
                    countFresh++;
            }
        }

        int maxTime = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.tm;

            maxTime = Math.max(maxTime, t);

            int[] delRow = new int[] { -1, 0, 1, 0 };
            int[] delCol = new int[] { 0, 1, 0, -1 };

            for (int i = 0; i < 4; i++) {
                int nrow = r + delRow[i];
                int ncol = c + delCol[i];

                if ((nrow >= 0 && nrow < n) && (ncol >= 0 && ncol < m) && grid[nrow][ncol] == 1
                        && vis[nrow][ncol] == 0) {
                    q.add(new Pair(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 2;
                    rottenCount++;
                }
            }
        }

        if (countFresh != rottenCount)
            return -1;
        return maxTime;
    }
}
