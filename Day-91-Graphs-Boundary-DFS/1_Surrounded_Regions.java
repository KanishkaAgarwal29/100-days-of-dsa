class Solution {
    int[] drow = { 1, 0, -1, 0 };
    int[] dcol = { 0, 1, 0, -1 };

    public void dfs(char[][] board, int row, int col) {
        board[row][col] = 'T';
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < 4; i++) {
            int r = drow[i] + row;
            int c = dcol[i] + col;

            if ((r >= 0 && r < m) && (c >= 0 && c < n) && board[r][c] == 'O') {
                dfs(board, r, c);
            }
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1);
            }
        }

        for (int i = 1; i < n - 1; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[m - 1][i] == 'O') {
                dfs(board, m - 1, i);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
