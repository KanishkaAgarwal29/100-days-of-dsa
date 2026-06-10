class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int j = 0;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offerLast(i);
            if (i - j + 1 == k) {
                ans[idx] = nums[dq.peekFirst()];
                idx++;
                if (j == dq.peekFirst())
                    dq.pollFirst();
                j++;
            }

        }
        return ans;
    }
}
