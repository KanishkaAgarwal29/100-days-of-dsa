class Solution {
    public int rowWithMax1s(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        int i = 0;
        int j = n - 1;
        
        int maxRow = -1;
        
        while(i < m && j >= 0){
            if(arr[i][j] == 0)i++;
            else{
                j--;
                maxRow = i;
            }
        }
        return maxRow;
    }
}
