class Solution {
    public int mySqrt(int x) {
        if (x <= 1)return x;
        int low = 1;
        int high = x/2;
        int res = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid > x / mid) {
                high = mid - 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
