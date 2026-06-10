class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        Deque<Integer> dq = new LinkedList<>();
        long sum = 0;
        int j = 0;
        int count = 0;

        for(int i = 0; i < chargeTimes.length; i++){
            sum+=runningCosts[i];
            while(!dq.isEmpty() && chargeTimes[i] > chargeTimes[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);

            long t = chargeTimes[dq.peekFirst()] + (i-j+1)*sum;
            while(t > budget){
                sum-=runningCosts[j];
                if(dq.peekFirst() == j)dq.pollFirst();
                j++;
                if(i - j + 1 == 0){
                    t = 0;
                    break;
                }
                t = chargeTimes[dq.peekFirst()] + (i-j+1)*sum;
            }
            if(t == 0)continue;
            count = Math.max(count, i - j + 1);
        }
        return count;
    }
}
