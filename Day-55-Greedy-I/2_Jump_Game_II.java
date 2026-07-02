class Solution {
    public int jump(int[] nums) {
        if(nums.length <= 1) return 0;
        int currfar = 0;
        int nextfar = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            nextfar = Math.max(nextfar, i + nums[i]);
            if(currfar == i){
                count++;
                currfar = nextfar;
            }
        }

        return count;
    }
}
