class Solution {
    public int getSecondLargest(int[] arr) {
        
        int max = arr[0];
        int secmax = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>secmax){
                secmax = arr[i];
            }
        }
        return secmax;
    }
}
