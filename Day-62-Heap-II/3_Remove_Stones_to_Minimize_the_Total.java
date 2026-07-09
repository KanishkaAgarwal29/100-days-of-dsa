class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for (int pile : piles) {
            pq.offer(pile);
            sum += pile;
        }

        while (k > 0) {
            int max = pq.poll();
            int removed = max / 2;
            sum -= removed;
            pq.offer(max - removed);
            k--;
        }

        return sum;
    }
}
