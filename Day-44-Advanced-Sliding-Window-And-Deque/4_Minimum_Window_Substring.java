class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int[] tfreq = new int[256];
        int[] sfreq = new int[256];
        int mini = Integer.MAX_VALUE;
        int count = 0;
        int start = -1;
        int end = -1;
        int j = 0;

        for (char c : t.toCharArray()) {
            tfreq[c]++;
            if (tfreq[c] == 1)
                count++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sfreq[c]++;
            if (sfreq[c] == tfreq[c] && tfreq[c] != 0) {
                count--;
            }

            while (count == 0) {
                if (i - j + 1 < mini) {
                    mini = i - j + 1;
                    start = j;
                    end = i;
                }
                char ch = s.charAt(j);
                sfreq[ch]--;
                if (tfreq[ch] != 0 && sfreq[ch] == tfreq[ch] - 1)
                    count++;
                j++;
            }
        }
        return mini == Integer.MAX_VALUE ? "" : s.substring(start, end + 1);
    }
}
