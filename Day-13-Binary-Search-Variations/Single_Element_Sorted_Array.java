class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
                    (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            } else if ((mid % 2 != 0 && nums[mid] == nums[mid - 1])
                    || (mid % 2 == 0 && nums[mid] == nums[mid + 1] && mid + 1 < nums.length)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}.
