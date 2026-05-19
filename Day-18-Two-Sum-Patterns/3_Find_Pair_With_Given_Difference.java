
class Solution {
    public boolean findPair(int[] nums, int x) {
        // code here
        HashSet<Integer> mpp = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (mpp.contains(nums[i] - x) || mpp.contains(nums[i] + x)) {
                return true;
            } else {
                mpp.add(nums[i]);
            }
        }
        return false;
    }
}
