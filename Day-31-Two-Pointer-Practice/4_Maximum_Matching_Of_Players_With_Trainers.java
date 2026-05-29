class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int pidx = 0;
        for (int trainer : trainers) {
            if (pidx < players.length && trainer >= players[pidx]) {
                pidx++;
            }
        }       
        return pidx;
    }
}
