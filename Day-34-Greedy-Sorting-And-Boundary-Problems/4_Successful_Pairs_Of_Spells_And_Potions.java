class Solution {
    public int bs(int[] nums, int num, long success){
        int low = 0;
        int high = nums.length;
        int ans = 0;

        while(low < high){
            int mid = low + (high - low)/2;
            if((long)nums[mid] * num >= success){
                ans = mid;
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length]; 
        int j = potions.length - 1;

        for(int i = 0; i < spells.length; i++){
            if((long)spells[i] * potions[j] < success)continue;
            int res = bs(potions, spells[i], success);
            ans[i] = j - res + 1;
        }
        return ans;
    }
}
