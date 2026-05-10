class Solution {
    public long eathrs(int[] piles, int mid) {
        long h = 0;
        for (int i : piles) {
            h += (long)(i + mid - 1) / mid;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            if (pile > high)
                high = pile;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hrs = eathrs(piles, mid);
            if (hrs <= (long)h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
