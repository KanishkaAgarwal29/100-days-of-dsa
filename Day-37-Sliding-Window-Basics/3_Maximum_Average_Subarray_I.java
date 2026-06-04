class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        int i = 0;
        int j = 0;
        double sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            if (i - j + 1 < k) {
                i++;
            } else if (i - j + 1 == k) {
                max = Math.max(sum / k, max);
                sum -= nums[j];
                j++;
                i++;
            }
        }
        return max;
    }
}
