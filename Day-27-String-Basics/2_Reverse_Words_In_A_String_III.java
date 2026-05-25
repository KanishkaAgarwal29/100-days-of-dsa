class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int j = i;
            while (j < str.length && str[j] != ' ') {
                j++;
            }
            reverse(str, i, j - 1);
            i = j;
        }
        return new String(str);
    }

    public void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
    }
}
