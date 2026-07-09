class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long prod = 1;
        int mod = 1000000007;

        for (int num : nums) {
            pq.offer(num);
        }

        while(k > 0){
            int min = pq.poll();
            pq.offer(min + 1);
            k--;
        }

        for (int x : pq) {
            prod = (prod * x) % mod;
        }

        return (int)prod;
    }
}
