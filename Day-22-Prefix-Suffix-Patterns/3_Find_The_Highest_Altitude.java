class Solution {
    public int largestAltitude(int[] gain) {
        int begin = 0;
        int maxi = 0;

        for (int i = 0; i < gain.length; i++) {
            maxi = Math.max(maxi, gain[i] + begin);
            begin = gain[i] + begin;
        }
        return maxi;
    }
}
