class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] rem = new int[n];

        for (int i = 0; i < n; i++) {
            rem[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(rem);

        int count = 0;
        while (count < n && additionalRocks >= rem[count]) {
            additionalRocks -= rem[count];
            count++;
        }

        return count;
    }
}
