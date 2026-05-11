class Solution {
    int countFreq(int[] nums, int target) {
        // code here
        int count = 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                count = 1;
                int ind = mid;
                while(ind - 1 >= 0 && nums[ind - 1] == nums[ind]){
                    ind--;
                    count++;
                }
                
                ind = mid;
                while(ind + 1 < nums.length && nums[ind + 1] == nums[ind]){
                    ind++;
                    count++;
                }
                
                break;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return count;
    }
}

