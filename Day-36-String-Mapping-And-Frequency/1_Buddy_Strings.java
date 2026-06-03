class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                if (freq[s.charAt(i) - 'a'] == 2)
                    return true;
            }
            return false;
        }

        int one = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (one == -1) {
                    one = i;
                } else if (second == -1) {
                    second = i;
                } else
                    return false;
            }
        }
        if (one != -1 && second == -1)
            return false;

        return s.charAt(one) == goal.charAt(second) && s.charAt(second) == goal.charAt(one);
    }
}
