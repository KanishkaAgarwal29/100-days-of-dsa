class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        int sum = 0;
        int i = nums.length - 1;
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            total += num;
        }

        while (total - sum >= sum) {
            ans.add(nums[i]);
            sum += nums[i];
            i--;
        }
        return ans;
    }
}
