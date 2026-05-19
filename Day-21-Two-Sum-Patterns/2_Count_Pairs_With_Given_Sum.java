class Solution {
    int countPairs(int nums[], int target) {
        // code here
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (mpp.containsKey(target - nums[i])) {
                count += mpp.get(target - nums[i]);
            }
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}
