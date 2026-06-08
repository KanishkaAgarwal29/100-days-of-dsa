class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int countZero = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
            if (countZero > 1) {
                while (countZero > 1) {
                    if (nums[j] == 0) {
                        countZero--;
                    }
                    j++;
                }
            }

            maxLen = Math.max(maxLen, i - j);

        }
        return maxLen;
    }
}
