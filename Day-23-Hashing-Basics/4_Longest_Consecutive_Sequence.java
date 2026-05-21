class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> mpp = new HashSet<>();

        for (int a : nums) {
            mpp.add(a);
        }

        for (int a : mpp) {
            if (!mpp.contains(a - 1)) {
                int count = 1;
                int num = a;

                while (mpp.contains(num + 1)) {
                    count++;
                    num++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
