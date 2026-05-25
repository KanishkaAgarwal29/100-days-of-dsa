class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int c = 0;

        while (i >= 0) {
            if (c != 0 && s.charAt(i) == ' ')
                break;
            else if (s.charAt(i) != ' ') {
                c++;
            }
            i--;
        }

        return c;
    }
}
