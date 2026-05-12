class Solution {
    public int minimum(int[] nums,int target){
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }
        return high;
    }

    public int bs(int[] nums, int target,int low,int high){
        

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
            
    }
    return -1;
}
    public int search(int[] nums, int target) {
        int n=nums.length;
        int minidx=minimum(nums,target);

        int left=bs(nums,target,0,minidx);
        if(left==-1){
            int right=bs(nums,target,minidx,n-1);
            return right;
        }
        return left;
    }
}
