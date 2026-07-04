class Solution {
    public int candy(int[] ratings) {
        int minCandies = 0;
        int n = ratings.length;
        int[] start = new int[n];
        int currCandies = 1;
        start[0] = 1;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                start[i] = start[i - 1] + 1;
            } else {
                start[i] = 1;
            }
        }

        minCandies = start[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                currCandies = currCandies + 1;
            } else {
                currCandies = 1;
            }

            minCandies += Math.max(currCandies, start[i]);
        }

        return minCandies;
    }
}
