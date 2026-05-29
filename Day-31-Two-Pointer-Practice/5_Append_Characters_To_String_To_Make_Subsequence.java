class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        for (char c : s.toCharArray()) {
            if (c == t.charAt(j)) {
                j++;
                if (j == t.length())
                    break;
            }
        }
        return t.length() - j;
    }
}
