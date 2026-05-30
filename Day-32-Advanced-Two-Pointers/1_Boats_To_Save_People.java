class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] freq = new int[limit + 1];
        int i = 0;
        int j = limit;
        int count = 0;
        for (int p : people) {
            freq[p]++;
        }
        while (i <= j) {
            while (i <= j && freq[i] <= 0)
                i++;
            while (i <= j && freq[j] <= 0)
                j--;
            if (i > j)
                break;
            if (i + j <= limit) {
                freq[i]--;
            }
            count++;
            freq[j]--;
        }

        return count;
    }
}
