class Solution {
    public String reversePrefix(String word, char ch) {
        char[] str = word.toCharArray();
        int j = -1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ch) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return word;

        int i = 0;
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        return new String(str);
    }
}
