class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        int windowSize = 2 * k + 1;
        int j = 0;
        long sum = 0;

        if (n < windowSize)
            return ans;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i - j + 1 == windowSize) {
                ans[j + k] = (int) (sum / windowSize);
                sum -= nums[j];
                j++;
            }
        }

        return ans;
    }
}
