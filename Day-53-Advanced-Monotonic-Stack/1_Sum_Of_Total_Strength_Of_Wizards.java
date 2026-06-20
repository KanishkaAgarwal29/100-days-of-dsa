class Solution {
    public int totalStrength(int[] strength) {
        int n = strength.length;
        Deque<Integer> st = new ArrayDeque<>();

        int[] ps = new int[n];
        int[] ns = new int[n];

        long sum = 0;
        long[] pref = new long[n + 1];
        long[] ppref = new long[n + 2];

        long mod = 1000000007L;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && strength[i] < strength[st.peek()]) {
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
            while (!st.isEmpty() && strength[i] <= strength[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ns[i] = n;
            } else {
                ns[i] = st.peek();
            }

            st.push(i);
        }

        for (int i = 1; i <= n; i++) {
            pref[i] = (pref[i - 1] + strength[i - 1]) % mod;
        }

        for (int i = 1; i <= n + 1; i++) {
            ppref[i] = (ppref[i - 1] + pref[i - 1]) % mod;
        }

        for (int i = 0; i < n; i++) {
            int lf = i - ps[i];
            int rg = ns[i] - i;

            long leftSum = (ppref[i + 1] - ppref[ps[i] + 1] + mod) % mod;
            long rightSum = (ppref[ns[i] + 1] - ppref[i + 1] + mod) % mod;

            long total = (rightSum * lf % mod - leftSum * rg % mod + mod) % mod;

            long ans = total * strength[i] % mod;

            sum = (sum + ans) % mod;
        }

        return (int) sum;
    }
}
