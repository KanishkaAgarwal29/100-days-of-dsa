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
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(entrance[0], entrance[1], 0));
        maze[entrance[0]][entrance[1]] = '+';

        int[] drow = { 1, 0, -1, 0 };
        int[] dcol = { 0, 1, 0, -1 };

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int row = curr.row + drow[i];
                int col = curr.col + dcol[i];
                int dis = curr.dis + 1;

                if ((row >= 0 && row < m) && (col >= 0 && col < n) && maze[row][col] == '.') {
                    q.offer(new Pair(row, col, dis));
                    maze[row][col] = '+';

                    if (row == 0 || row == m - 1 || col == 0 || col == n - 1) {
                        return dis;
                    }
                }
            }
        }

        return -1;
    }
}
