class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int len = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            if ((i - j + 1) - maxFreq > k) {
                while ((i - j + 1) - maxFreq > k) {
                    char ch = s.charAt(j);
                    freq[ch - 'A']--;
                    j++;
                }
            }
            len = Math.max(len, i - j + 1);
        }
        return len;
    }
}
