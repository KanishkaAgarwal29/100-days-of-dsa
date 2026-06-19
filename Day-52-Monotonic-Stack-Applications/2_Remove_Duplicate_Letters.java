class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] check = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            if (check[c - 'a'] == true)
                continue;

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) >= c && freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                check[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            check[c - 'a'] = true;
        }

        return sb.toString();
    }
}
