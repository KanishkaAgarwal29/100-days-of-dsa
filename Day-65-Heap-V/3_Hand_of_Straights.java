class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        Arrays.sort(hand);
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int num : hand) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        for (int num : hand) {
            if (!mpp.containsKey(num))
                continue;

            for (int i = 0; i < groupSize; i++) {
                int curr = num + i;
                if (!mpp.containsKey(curr))
                    return false;
                mpp.put(curr, mpp.get(curr) - 1);

                if (mpp.get(curr) == 0)
                    mpp.remove(curr);
            }
        }

        return true;
    }
}
