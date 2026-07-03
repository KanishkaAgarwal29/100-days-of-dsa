class Solution {
    public int twoCitySchedCost(int[][] cost) {
        Arrays.sort(cost, (a, b) -> Integer.compare(a[1] - a[0], b[1] - b[0]));
        int sum = 0;

        for(int i = 0; i < cost.length; i++){
            if(i < cost.length/2){
                sum+=cost[i][1];
            }
            else{
                sum+=cost[i][0];
            }
        }
        return sum;
    }
}
