class Pair {
    int row;
    int col;
    int vis;

    Pair(int row, int col, int vis) {
        this.row = row;
        this.col = col;
        this.vis = vis;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        if (n == 1)
            return 1;
        int ans = -1;

        Queue<Pair> q = new ArrayDeque<>();
        int[] drow = { 1, 1, 0, -1, -1, -1, 0, 1 };
        int[] dcol = { 0, 1, 1, 1, 0, -1, -1, -1 };

        q.offer(new Pair(0, 0, 1));
        grid[0][0] = -1;

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            for (int i = 0; i < 8; i++) {
                int row = curr.row + drow[i];
                int col = curr.col + dcol[i];
                int vis = curr.vis + 1;

                if ((row >= 0 && row < n) && (col >= 0 && col < n) && grid[row][col] == 0) {
                    if (row == n - 1 && col == n - 1) {
                        return vis;
                    }
                    q.offer(new Pair(row, col, vis));
                    grid[row][col] = -1;
                }

                
            }
        }
        return ans;
    }
}
