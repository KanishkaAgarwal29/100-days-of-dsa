class Solution {
    int m, n;
    int[] drow = { 1, 0, -1, 0 };
    int[] dcol = { 0, 1, 0, -1 };

    public boolean dfs(int[][] grid1, int[][] grid2, int row, int col) {
        grid2[row][col] = 0;
        boolean ans = grid1[row][col] == 1;

        for (int i = 0; i < 4; i++) {
            int r = drow[i] + row;
            int c = dcol[i] + col;

            if ((r >= 0 && r < m) && (c >= 0 && c < n) && grid2[r][c] == 1) {
                if (!dfs(grid1, grid2, r, c)) {
                    ans = false;
                }
            }
        }

        return ans;
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        m = grid1.length;
        n = grid1[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    if (dfs(grid1, grid2, i, j)) {
                        ans++;
                    }

                }
            }
        }

        return ans;
    }
}
