class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int low = 0;
        int high = n - 1;
        char c = letters[0];

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (letters[high] > target)
            return letters[high];
        return letters[0];
    }
}
