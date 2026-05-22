class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int max = 0;
        int sum = 0;

        for (int a : nums) {
            mpp.put(a, mpp.getOrDefault(a, 0) + 1);
            int curr = mpp.get(a);
            if (curr == max) {
                sum += curr;
            } else if (curr > max) {
                sum = curr;
                max = curr;
            }
        }

        return sum;
    }
}
