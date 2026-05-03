class Solution {
    int maxProduct(int[] arr) {
        int curmax=arr[0];
        int curmin=arr[0];
        int max=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=curmax;
                curmax=curmin;
                curmin=temp;
            }
            curmax=Math.max(arr[i],curmax*arr[i]);
            curmin=Math.min(arr[i],curmin*arr[i]);
            max=Math.max(max,curmax);
        }
        
        return max;
    }
}
