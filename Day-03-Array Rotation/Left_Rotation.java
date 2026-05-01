class Solution {
    
    static void reverse(int start, int end, int[] arr){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static void rotateArr(int arr[], int d) {
        // code here
        d = d % arr.length;
        reverse(0, d - 1, arr);
        reverse(d, arr.length - 1, arr);
        
        reverse(0, arr.length - 1, arr);
    }
}
