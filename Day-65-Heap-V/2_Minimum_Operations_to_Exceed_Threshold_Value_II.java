class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer((long)num);
        }
        int count = 0;

        while(pq.peek() < k && pq.size()>=2){
            long min = pq.poll();
            long max = pq.poll();
            count++;

            pq.offer((min*2) + max);
        }

        return count;
    }
}
