class Solution {
    public boolean checkXMatrix(int[][] matrix) {
        int size = matrix.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col || col == size - row - 1) {
                    if (matrix[row][col] == 0) {
                        return false;
                    }
                } else {
                    if (matrix[row][col] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
