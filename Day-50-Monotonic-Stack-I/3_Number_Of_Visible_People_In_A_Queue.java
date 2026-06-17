class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            while (!st.isEmpty() && heights[i] > st.peek()) {
                st.pop();
                count++;
            }
            if (!st.isEmpty()) {
                count++;
            }

            ans[i] = count;
            st.push(heights[i]);
        }
        return ans;
    }
}
