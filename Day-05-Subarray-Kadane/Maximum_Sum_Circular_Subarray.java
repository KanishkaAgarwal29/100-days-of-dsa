class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMax = nums[0], maxSum = nums[0];
        int currMin = nums[0], minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(x, currMin + x);
            minSum = Math.min(minSum, currMin);
            total += x;
        }

        total += nums[0];
        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, total - minSum);
    }
}
