class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] freq = new int[n + 1];
        int[] nfreq = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            freq[trust[i][1]]++;
            nfreq[trust[i][0]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == n - 1 && nfreq[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
