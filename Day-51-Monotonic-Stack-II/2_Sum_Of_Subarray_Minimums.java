class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n = arr.length;
        Deque<Integer> st = new ArrayDeque<>();
        int[] ps = new int[n];
        int[] ns = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ns[i] = n;
            } else {
                ns[i] = st.peek();
            }

            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int ans = (ns[i] - i) * (i - ps[i]) * arr[i];
            sum +=ans;
        }

        
        return sum;    
    }
}
