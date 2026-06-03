class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] required = new int[26];
        List<String> result = new ArrayList<>();

        for (String word : words2) {
            int[] freq = getFrequency(word);

            for (int i = 0; i < 26; i++) {
                required[i] = Math.max(required[i], freq[i]);
            }
        }

        for (String word : words1) {
            int[] freq = getFrequency(word);

            boolean isUniversal = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] < required[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }

    private int[] getFrequency(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        return freq;
    }
}
