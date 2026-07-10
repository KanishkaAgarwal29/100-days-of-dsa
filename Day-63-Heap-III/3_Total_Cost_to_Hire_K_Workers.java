class Solution {
    public long totalCost(int[] costs, int k, int cd) {
        PriorityQueue<Integer> pqs = new PriorityQueue<>();
        PriorityQueue<Integer> pql = new PriorityQueue<>();

        int i = 0;
        int j = costs.length - 1;
        long cost = 0;

        while (pqs.size() < cd && i <= j) {
            pqs.offer(costs[i++]);
        }

        while (pql.size() < cd && i <= j) {
            pql.offer(costs[j--]);
        }

        while (k-- > 0) {

            if (pql.isEmpty() || (!pqs.isEmpty() && pqs.peek() <= pql.peek())) {
                cost += pqs.poll();

                if (i <= j) {
                    pqs.offer(costs[i++]);
                }
            } else {
                cost += pql.poll();

                if (i <= j) {
                    pql.offer(costs[j--]);
                }
            }
        }

        return cost;
    }
}
