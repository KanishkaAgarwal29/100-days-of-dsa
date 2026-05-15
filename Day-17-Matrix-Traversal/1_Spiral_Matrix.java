class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int top = 0;
        int bottom = m - 1;

        int left = 0;
        int right = n - 1;

        while( top <= bottom &&  left <= right){

            if(top <= bottom)
                {for(int j = left ; j <= right; j++ ){
                    ans.add(mat[top][j]);
                }
                top++;}

            if(left <= right){
                for(int j = top ; j <= bottom; j++ ){
                    ans.add(mat[j][right]);
                }
                right--;}

            if(top <= bottom){
                for(int j = right ; j >= left; j-- ){
                    ans.add(mat[bottom][j]);
                }
                bottom--;}

            if(left <= right){
                for(int j = bottom ; j >= top; j-- ){
                    ans.add(mat[j][left]);
                }
                left++;}
        }

        return ans;
    }
}
