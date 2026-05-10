class Solution {
    public int arrangeCoins(int n) {
        if (n <= 1) return n;
        long low = 1;
        long high = n;
        long count = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            count = mid * (mid + 1) / 2;
            if (count == n)
                return (int) mid;
            else if (count < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}
