class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int i = 1;
        int j = 0;

        while(i < nums.length && j < nums.length ) {
            while(j < nums.length && nums[j] % 2 == 0) {
                j += 2;
            } 
            while(i < nums.length && nums[i] % 2 != 0) {
                i += 2;
            }

            if(i < nums.length && j < nums.length){
                swap(nums, i , j);
            }
        }
        return nums;
    }
}
