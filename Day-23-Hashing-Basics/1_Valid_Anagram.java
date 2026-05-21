class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen)
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < slen; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (char a : s.toCharArray()) {
            if (freq[a - 'a'] != 0)
                return false;
        }

        return true;
    }
}
