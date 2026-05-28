class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2)
            return n;
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < n) {
            if (nums[i] == nums[j]) {
                if (j - i <= 1) {
                    nums[k] = nums[i];
                    k++;
                }
                j++;
            } else {
                i = j;
            }
        }
        return k;
    }
}
