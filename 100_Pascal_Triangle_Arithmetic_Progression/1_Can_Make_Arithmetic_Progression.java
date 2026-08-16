class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean[] pos = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        if (min == max)
            return true;

        int diff = max - min;

        if (diff % (arr.length - 1) != 0)
            return false;
        diff = diff / (arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - min) % diff != 0) {
                return false;
            }

            int ind = (arr[i] - min) / diff;

            if (pos[ind]) {
                return false;
            }

            pos[ind] = true;
        }

        return true;
    }
}
