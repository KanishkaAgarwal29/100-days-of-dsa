class Solution {
    
    private void minmax(int arr[],int start, int n){
        int min=start;
        int max=start;
        
        for(int i=start;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        int temp=arr[max];
        arr[max]=arr[start];
        arr[start]=temp;
        
        if (min == start) {
            min = max;
        }
        
        if(start + 1 < n){
            temp = arr[min];
            arr[min] = arr[start + 1];
            arr[start + 1] = temp;
        }
    }
    
    public void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            minmax(arr,i,n);
        }
        
    }
}
