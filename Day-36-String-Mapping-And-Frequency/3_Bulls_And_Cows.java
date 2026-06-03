class Solution {
    public String getHint(String secret, String guess) {
        int countBull = 0;
        int totalMatches = 0;
        int[] freq = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            freq[guess.charAt(i) - '0']++;
        }

        for (int i = 0; i < secret.length(); i++) {
            if (freq[secret.charAt(i) - '0'] > 0) {
                totalMatches++;
                freq[secret.charAt(i) - '0']--;
            }
            if (secret.charAt(i) == guess.charAt(i))
                countBull++;
        }

        return countBull + "A" + (totalMatches - countBull) + "B";

    }
}
