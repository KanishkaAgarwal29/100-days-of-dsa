class Solution {
    public int minStartValue(int[] nums) {
        int mini = 0;
        int diff = 0;

        for (int a : nums) {
            diff += a;
            mini = Math.min(mini, diff);
        }

        return (-1 * mini) + 1;
    }
}
