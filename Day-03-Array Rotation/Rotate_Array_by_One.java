// // User function Template for Java

class Solution {
    
    static void reverse(int start, int end, int[] arr){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public void rotate(int[] arr) {
        
        reverse(0, arr.length - 1, arr);
        reverse(1, arr.length - 1, arr);
        
        
    }
}
