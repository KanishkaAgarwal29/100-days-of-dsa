class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;

        HashMap<String, Integer> mpp = new HashMap<>();
        int[] freq = new int[26];

        for (int i = 0; i < str.length; i++) {
            char c = pattern.charAt(i);

            if ((mpp.containsKey(str[i]) && mpp.get(str[i]) != freq[c - 'a']) || (!mpp.containsKey(str[i]) && freq[c - 'a'] != 0)) {
                return false;
            }

            freq[c - 'a'] = i + 1;
            mpp.put(str[i], i + 1);

        }
        return true;
    }
}
