class Solution {
    int thirdLargest(int arr[]) {
        // code here
        if(arr.length < 3)return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int a : arr){
            if(a >= first){
                third = second;
                second = first;
                first = a;
            }
            else if(a>=second){
                third = second;
                second = a;
            }
            else if (a>third){
                third = a;
            }
        }
        
        return third;
    }
}
