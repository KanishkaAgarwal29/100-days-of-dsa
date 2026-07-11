class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0], a[0]));
        int n = score.length;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++){
            pq.offer(new int[]{score[i], i});
        }
        int rank = 1;
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            if(rank == 1){
                ans[curr[1]] = "Gold Medal";
            }
            else if(rank == 2){
                ans[curr[1]] = "Silver Medal";
            }
            else if(rank == 3){
                ans[curr[1]] = "Bronze Medal";
            }
            else{
                ans[curr[1]] = rank + "";
            }
            rank++;               
        }

        return ans;
    }
}
