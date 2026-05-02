class Solution {
    public int pivotIndex(int[] nums) {
        int index =-1;
        int n=nums.length;
        int total=0;
        
        for(int i=0;i<n;i++){
            total+=nums[i];
        }

        int sum=0;
        for(int i=0;i<n;i++){
            if(total-2*sum==nums[i]){
                index=i;
                break;
            }
            sum=sum+nums[i];
        }
        return index;
    }
}
