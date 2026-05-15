class Solution {
    public int[][] generateMatrix(int n) {
        int i = 1;
        int[][] ans = new int[n][n];
        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            if (top <= bottom) {
                for (int j = left; j <= right; j++) {
                    ans[top][j] = i++;
                }
                top++;
            }

            if (left <= right) {
                for (int j = top; j <= bottom; j++) {
                    ans[j][right] = i++;
                }
                right--;
            }

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = i++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    ans[j][left] = i++;
                }
                left++;
            }
        }

        return ans;
    }
}
