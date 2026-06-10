class Solution {
    public boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int vowels = 0;
        int maxVowels = 0;
        char[] ch = s.toCharArray();

        while (j < s.length()) {
            if (checkVowel(ch[j])) {
                vowels++;
            }

            if (j - i + 1 < k) {
                j++;
            } else {
                maxVowels = Math.max(maxVowels, vowels);
                if (checkVowel(ch[i])) {
                    vowels--;
                }
                i++;
                j++;
            }
        }
        return maxVowels;
    }
}
