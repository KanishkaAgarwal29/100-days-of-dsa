class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long score = 0;
        for (int num : nums) {
            pq.offer(num);
        }
        while (!pq.isEmpty() && k > 0) {
            int top = pq.poll();
            score += top;
            pq.offer((top + 2) / 3);
            k--;
        }

        return score;
    }
}
