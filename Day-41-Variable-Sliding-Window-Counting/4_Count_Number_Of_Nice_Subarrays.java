class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        int countOdd = 0;
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                countOdd++;
            }
            if (countOdd > k) {
                while (countOdd > k) {
                    if (nums[j] % 2 != 0) {
                        countOdd--;
                    }
                    j++;
                }
            }
            count += i - j + 1;
        }
        return count;
    }

}
