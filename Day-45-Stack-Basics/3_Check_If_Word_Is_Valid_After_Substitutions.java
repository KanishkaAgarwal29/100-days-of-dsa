class Solution {
    public boolean isValid(String s) {
        if (s.length() % 3 != 0)
            return false;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'c') {
                int len = sb.length();
                if (len < 2)
                    return false;
                if (sb.charAt(len - 1) != 'b' || sb.charAt(len - 2) != 'a')
                    return false;
                sb.deleteCharAt(len - 1);
                sb.deleteCharAt(len - 2);
            } else {
                sb.append(c);
            }
        }
        return sb.length() == 0;
    }
}
