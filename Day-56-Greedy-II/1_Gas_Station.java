class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tank = 0;
        int rem = 0;
        int n = gas.length;

        for(int i = 0; i < n; i++){
            tank += gas[i] - cost[i];

            if(tank < 0){
                rem +=tank;
                tank = 0;
                start = i+1;
            }
        }
        return tank + rem < 0 ? -1 : start;
    }
}
