class Solution {
    public int atMost(int[] arr, int target){
        int count=0;
        int j = 0;
        int sum=0;
        
        for(int i = 0 ; i < arr.length; i++){
            sum +=arr[i];
            while(sum > target){
                sum-=arr[j];
                j++;
            }
            count+=i-j+1;
        }
        
        return count;
    }
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        return atMost(arr, target) - atMost(arr, target - 1);
    }
}
