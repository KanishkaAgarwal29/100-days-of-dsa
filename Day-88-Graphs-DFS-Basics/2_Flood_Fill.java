class Solution {

    int[] drow = {-1, 0, 1, 0};
    int[] dcol = {0, 1, 0, -1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];

        if (oldColor == color) return image;

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {

        image[row][col] = newColor;

        for (int i = 0; i < 4; i++) {

            int nr = row + drow[i];
            int nc = col + dcol[i];

            if (nr >= 0 && nr < image.length &&
                nc >= 0 && nc < image[0].length &&
                image[nr][nc] == oldColor) {

                dfs(image, nr, nc, oldColor, newColor);
            }
        }
    }
}
