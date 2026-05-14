class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image.length;
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                if (image[i][start] == image[i][end]) {
                    image[i][start] ^= 1;
                    if (start < end) {
                        image[i][end] ^= 1;
                    }
                }
                start++;
                end--;
            }
        }
        return image;
    }
}
