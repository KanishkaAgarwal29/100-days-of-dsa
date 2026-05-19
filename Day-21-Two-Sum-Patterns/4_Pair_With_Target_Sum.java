class Solution {
    boolean twoSum(int nums[], int target) {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mpp.containsKey(target - nums[i])) {
                return true;
            } else {
                mpp.put(nums[i], i);
            }
        }
        return false;
    }
}
