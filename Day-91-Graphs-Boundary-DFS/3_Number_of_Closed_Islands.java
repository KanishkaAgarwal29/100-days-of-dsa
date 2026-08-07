class Solution {
    int[] drow = { 1, 0, -1, 0 };
    int[] dcol = { 0, 1, 0, -1 };

    public void dfs(int[][] grid, int row, int col) {
        grid[row][col] = 1;
        
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < 4; i++) {
            int r = drow[i] + row;
            int c = dcol[i] + col;

            if ((r >= 0 && r < m) && (c >= 0 && c < n) && grid[r][c] == 0) {
                dfs(grid, r, c);
            }
        }
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                dfs(grid, i, 0);
            }
            if (grid[i][n - 1] == 0) {
                dfs(grid, i, n - 1);
            }
        }

        for (int i = 1; i < n - 1; i++) {
            if (grid[0][i] == 0) {
                dfs(grid, 0, i);
            }
            if (grid[m - 1][i] == 0) {
                dfs(grid, m - 1, i);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }

        return ans;
    }
}
