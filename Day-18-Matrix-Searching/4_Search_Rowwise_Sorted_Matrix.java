class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i = 0; i < m ;i++){
            int low = 0;
            int high = n - 1;
            
            while(low <= high){
                int mid = low + (high - low)/2;
                if(mat[i][mid] == x)return true;
                else if(mat[i][mid] > x) high = mid - 1;
                else low = mid + 1;
            }
        }
        
        return false;
    }
}
