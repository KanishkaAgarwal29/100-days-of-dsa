class Solution {
    public int halveArray(int[] nums) {
        double total = 0;
        double sum = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for(int a : nums){
            pq.offer((double)a);
            total+=a;
        }

        sum = total;

        while(2 * sum > total){
            double max = pq.poll()/2.0;
            sum-= max;
            pq.offer(max);
            count++;
        }

        return count;
    }
}
