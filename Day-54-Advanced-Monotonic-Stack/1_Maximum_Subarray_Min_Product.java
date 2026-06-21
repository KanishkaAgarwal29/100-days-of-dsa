class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        long[] pref = new long[n + 1];
        long ans = 0;
        long mod = 1000000007;

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
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
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ns[i] = n;
            } else {
                ns[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 1; i < n + 1; i++) {
            pref[i] = pref[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < n; i++) {

            long sum = pref[ns[i]] - pref[ps[i] + 1];

            ans = Math.max(ans, sum * nums[i]);
        }

        return (int) (ans % mod);
    }
}
