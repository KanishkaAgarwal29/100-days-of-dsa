class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
        int[] ans = new int[k];

        for(int i = 0; i < nums.length ; i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size() > k){
                pq.poll();
            }
        }
        int i = 0;
        while(!pq.isEmpty()){
            pq1.offer(pq.poll());
        }
        while(!pq1.isEmpty()){
            ans[i++] = pq1.poll()[0];
        }
        return ans;
    }
}
