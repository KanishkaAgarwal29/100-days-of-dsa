class Solution {
    public int maxWater(int height[]) {
        // code here
        Deque<Integer> st = new ArrayDeque<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int bottom = st.pop();
                if (st.isEmpty())
                    break;

                int left = st.peek();
                int width = i - left - 1;
                int h = Math.min(height[left], height[i]) - height[bottom];

                ans += width * h;
            }

            st.push(i);
        }

        return ans;
    }
}
