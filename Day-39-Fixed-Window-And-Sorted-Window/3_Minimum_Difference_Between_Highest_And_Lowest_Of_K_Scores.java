class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        
        Arrays.sort(nums);
        int minDif = Integer.MAX_VALUE;
        
        for (int i = k - 1; i < nums.length; i++) {
            int dif = nums[i] - nums[i - k + 1];
            minDif = Math.min(minDif, dif);
        }
        
        return minDif;
    }
}
