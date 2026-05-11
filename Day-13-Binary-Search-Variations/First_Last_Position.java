class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                int ind = mid;
                while(ind - 1 >= 0 && nums[ind - 1] == nums[ind]){
                    ind--;
                }
                ans[0] = ind;

                ind = mid;
                while(ind + 1 < nums.length && nums[ind + 1] == nums[ind]){
                    ind++;
                }
                ans[1] = ind;
                break;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
