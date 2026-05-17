class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int idx = 0;

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[idx][1] < intervals[i][0]) {
                idx++;
                intervals[idx][0] = intervals[i][0];
                intervals[idx][1] = intervals[i][1];

            } else {
                intervals[idx][1] = Math.max(intervals[idx][1], intervals[i][1]);
            }
        }
        
        return Arrays.copyOfRange(intervals, 0, idx + 1);
    }
}
