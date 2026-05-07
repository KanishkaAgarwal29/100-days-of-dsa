class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total = 0;
        int sum = 0;
        
        for(int a : arr){
            total+=a;
        }
        
        for(int i = 0; i< arr.length ; i++){
            total-=arr[i];
            if(sum == total)return i;
            sum+=arr[i];
        }
         
        return -1;  
    }
}
