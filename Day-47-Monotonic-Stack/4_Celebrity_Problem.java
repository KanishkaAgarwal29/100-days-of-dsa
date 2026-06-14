class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < mat.length; i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int num1 = st.pop();
            int num2 = st.pop();
            
            if(mat[num2][num1] == 1){
                st.push(num1);
            }
            else{
                st.push(num2);
            }
            
        }
        
        int celeb = st.pop();
        for(int i = 0; i < mat.length; i++){
            if((mat[celeb][i] == 1 || mat[i][celeb] == 0) && i != celeb)return -1;
        }
        return celeb;
    }
}
