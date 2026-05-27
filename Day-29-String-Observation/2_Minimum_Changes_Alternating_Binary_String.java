class Solution {
    public int check(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2 == 0 && ch != s.charAt(i)) || (i % 2 != 0 && ch == s.charAt(i)))
                count++;
        }
        return count;
    }

    public int minOperations(String s) {
        int n = s.length();
        int count1 = check(s, '0');
        int count2 = check(s, '1');

        return Math.min(count1, count2);
    }
}
