class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int base = 0;
        int extra = 0;
        int maxExtra = 0;
        int j = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            if (i - j + 1 == minutes) {
                maxExtra = Math.max(maxExtra, extra);
                if (grumpy[j] == 1) {
                    extra -= customers[j];
                }
                j++;
            }

        }

        return base + maxExtra;
    }
}
