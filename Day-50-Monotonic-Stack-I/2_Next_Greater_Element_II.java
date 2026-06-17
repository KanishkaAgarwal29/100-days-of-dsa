class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 2 * n - 1 ; i >= 0 ; i--){
            while(!st.isEmpty() && nums[i%n] >= st.peek()) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i%n] = st.peek();
            }
            else{
                ans[i%n] = -1;
            }
            st.push(nums[i%n]);
        }

        return ans;
    }
}
