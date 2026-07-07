class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (x, y) -> Integer.compare(y[1], x[1])
        );

        if(a != 0){
            pq.offer(new int[]{0,a});
        }
        if(b != 0){
            pq.offer(new int[]{1,b});
        }
        if(c != 0){
            pq.offer(new int[]{2,c});
        }
        
        StringBuilder sb = new StringBuilder();

        int last = -1;
        int seclast = -1;

        while(!pq.isEmpty()){
            int[] largest = pq.poll();

            if(sb.length() > 1 && last == largest[0] && seclast == largest[0] ){
                if(pq.isEmpty())break;
                int[] select = pq.poll();
                pq.offer(largest);
                largest = select;
            }

            seclast = last;
            last = largest[0];
            sb.append((char) ('a' + largest[0]));
            largest[1]--;

            if(largest[1] > 0){
                pq.offer(largest);
            }
        }
        return sb.toString();
    }
}
