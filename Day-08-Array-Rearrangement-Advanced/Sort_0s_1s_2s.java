class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n - 1;
        
        while(i <= k){
            if(arr[i] == 0){
                arr[i] = arr[j];
                arr[j] = 0;
                j++;
                i++;
            }
            else if(arr[i] == 2){
                arr[i] = arr[k];
                arr[k] = 2;
                k--;
            }
            else if(arr[i] == 1){
                i++;
            }
        }
    }
}
