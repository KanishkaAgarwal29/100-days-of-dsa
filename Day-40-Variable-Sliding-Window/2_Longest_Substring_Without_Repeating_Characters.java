class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int len = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
            if (freq[c] > 1) {
                while (freq[c] > 1) {
                    freq[s.charAt(j)]--;
                    j++;
                }
            }

            len = Math.max(len, i - j + 1);
        }
        return len;
    }
}
