class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> mindq = new ArrayDeque<>();
        Deque<Integer> maxdq = new ArrayDeque<>();
        int len = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!mindq.isEmpty() && nums[i] < nums[mindq.peekLast()]) {
                mindq.pollLast();
            }
            mindq.offerLast(i);

            while (!maxdq.isEmpty() && nums[i] > nums[maxdq.peekLast()]) {
                maxdq.pollLast();
            }
            maxdq.offerLast(i);

            while (nums[maxdq.peekFirst()] - nums[mindq.peekFirst()] > limit) {
                if (mindq.peekFirst() == j)
                    mindq.pollFirst();
                if (maxdq.peekFirst() == j)
                    maxdq.pollFirst();
                j++;
            }

            len = Math.max(len, i - j + 1);
        }
        return len;
    }
}
