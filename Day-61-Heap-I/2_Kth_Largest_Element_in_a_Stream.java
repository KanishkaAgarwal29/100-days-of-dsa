class KthLargest {
    PriorityQueue<Integer> pq;
    int K ;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        K = k;
        for (int a : nums) {
            pq.offer(a);
            if(pq.size() > k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > K){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
