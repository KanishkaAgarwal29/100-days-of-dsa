class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] pref = new int[nums.length];
        int total = nums[0];
        pref[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i - 1];
            total += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            pref[i] = Math.abs(2 * pref[i] - total + nums[i]);
        }

        return pref;
    }
}
