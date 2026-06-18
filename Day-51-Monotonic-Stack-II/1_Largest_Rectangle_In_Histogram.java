class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        int maxi = 0;
        
        for(int i = 0; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = st.peek();
            }
            
            st.push(i);
        }
        
        st.clear();
        
        for(int i = n-1; i >= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        
        for(int i = 0; i < n ; i++){
            int width = nsr[i] - nsl[i] - 1;
            maxi = Math.max(maxi, width * arr[i]);
        }
        
        return maxi;
    }
}
