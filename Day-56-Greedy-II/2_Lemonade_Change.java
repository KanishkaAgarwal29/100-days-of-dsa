class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
                continue;
            } else if (bill == 10) {
                ten++;
                if (five == 0)
                    return false;
                five--;
                continue;
            } else {
                int rem = bill - 5;
                if (ten >= 1) {
                    ten--;
                    rem = 5;
                }
                if (five < rem / 5)
                    return false;
                five -= rem / 5;
            }
        }

        return true;
    }
}
