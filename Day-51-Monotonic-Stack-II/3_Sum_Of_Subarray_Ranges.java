class Solution {
    public int max(int[] arr) {
        int n = arr.length;
        Deque<Integer> st = new ArrayDeque<>();
        int[] pl = new int[n];
        int[] nl = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pl[i] = -1;
            } else {
                pl[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nl[i] = n;
            } else {
                nl[i] = st.peek();
            }

            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int ans = (nl[i] - i) * (i - pl[i]) * arr[i];
            sum += ans;
        }

        return sum;
    }

    public int min(int[] arr) {
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
            sum += ans;
        }

        return sum;
    }
    
    public int subarrayRanges(int[] arr) {
        // code here
        return max(arr) - min(arr);
    }
}
