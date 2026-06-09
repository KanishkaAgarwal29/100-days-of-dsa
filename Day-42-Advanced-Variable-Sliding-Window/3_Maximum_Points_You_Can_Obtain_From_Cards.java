class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // code here.
        int n = cardPoints.length;
        int total = 0;

        for (int num : cardPoints) {
            total += num;
        }

        int mini = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {

            sum += cardPoints[i];

            while (i - j + 1 > n - k) {
                sum -= cardPoints[j];
                j++;
            }

            if (i - j + 1 == n - k) {
                mini = Math.min(mini, sum);
            }
        }

        return total - mini;
    }
}
