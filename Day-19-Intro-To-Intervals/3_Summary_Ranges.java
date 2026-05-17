class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0)
            return res;

        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (i - idx == 1) {
                    res.add("" + nums[idx]);
                } else {
                    res.add(nums[idx] + "->" + nums[i - 1]);
                }
                idx = i;
            }
        }
        if (idx == nums.length - 1) {
            res.add("" + nums[idx]);
        } else {
            res.add(nums[idx] + "->" + nums[nums.length - 1]);
        }

        return res;
    }
}
