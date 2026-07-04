class Solution {
    public int findMinArrowShots(int[][] points) {
        int max = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int i = 0;

        while (i < points.length) {
            int end = points[i][1];
            max++;
            while (i < points.length && points[i][0] <= end) {
                i++;
            }
        }
        return max;
    }
}
