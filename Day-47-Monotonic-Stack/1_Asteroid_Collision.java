class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && (st.peek() > 0 && asteroid < 0)) {
                if (st.peek() == -asteroid) {
                    st.pop();
                    destroyed = true;
                    break;
                } else if (st.peek() > -asteroid) {
                    destroyed = true;
                    break;
                } else {
                    st.pop();
                }
            }

            if (!destroyed) {
                st.push(asteroid);
            }

        }

        int[] ans = new int[st.size()];
        int idx = 0;
        for (int num : st) {
            ans[idx] = num;
            idx++;
        }

        return ans;
    }
}
