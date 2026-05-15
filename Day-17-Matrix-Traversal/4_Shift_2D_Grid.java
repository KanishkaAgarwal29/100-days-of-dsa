class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        k %= m * n;
        int[][] newGrid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int idx = (i * n + j + k) % total;
                newGrid[idx / n][idx % n] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ans.add(new ArrayList<>());

            for (int j = 0; j < n; j++) {
                ans.get(i).add(newGrid[i][j]);
            }
        }

        return ans;
    }
}
