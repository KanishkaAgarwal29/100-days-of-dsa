class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (k > nums.length)
            return 0;
        long sum = 0;
        long maxSum = 0;
        int j = 0;
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            while (window.contains(nums[i])) {
                sum -= nums[j];
                window.remove(nums[j]);
                j++;
            }
            window.add(nums[i]);
            sum += nums[i];
            if (window.size() == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[j];
                window.remove(nums[j]);
                j++;
            }
        }
        return maxSum;
    }
}
