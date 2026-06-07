class Solution {
    public int longestOnes(int[] nums, int k) {
        int countZero = 0;
        int maxOnes = 0;
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            }
            if(countZero > k){
                while(countZero > k){
                    if(nums[j] == 0){
                        countZero--;
                    }
                    j++;
                }
            }

            maxOnes = Math.max(maxOnes, i - j + 1);
        }

        return maxOnes;
    }
}
