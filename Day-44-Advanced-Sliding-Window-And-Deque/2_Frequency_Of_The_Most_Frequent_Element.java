class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 0;
        long sum = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while ((long) nums[i] * (i - j + 1) - sum > k) {
                sum -= nums[j];
                j++;
            }
            maxlen = Math.max(maxlen, i - j + 1);
        }

        return maxlen;
    }
}
