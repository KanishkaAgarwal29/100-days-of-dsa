class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for (int gift : gifts) {
            pq.offer(gift);
        }

        while (k > 0) {
            int max = pq.poll();
            pq.offer((int) Math.sqrt(max));
            k--;
        }

        for (int x : pq) {
            sum += x;
        }

        return sum;
    }
}
